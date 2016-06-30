package biyabi.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import biyabi.R;

public class HomeTitleIndictor extends View {
    private int mCount,mRadius,mSpace,mFocusColor,mNormalColor,mIndex;

    public HomeTitleIndictor(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.HomeTitleIndictor);
        mCount = array.getInt(R.styleable.HomeTitleIndictor_count, 1);
        mRadius = array.getDimensionPixelOffset(R.styleable.HomeTitleIndictor_radius, 5);
        mSpace = array.getDimensionPixelOffset(R.styleable.HomeTitleIndictor_space, 5);
        mFocusColor = array.getColor(R.styleable.HomeTitleIndictor_focusColor, 0xf00);
        mNormalColor = array.getColor(R.styleable.HomeTitleIndictor_normalColor, 0xccc);
        mIndex = array.getInt(R.styleable.HomeTitleIndictor_index, 0);
        array.recycle();
    }

    public void setmCount(int mCount) {
        this.mCount = mCount;
        invalidate();
    }

    public void setIndex(int index) {
        this.mIndex = index;
        invalidate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(measureWidth(widthMeasureSpec), measureHeight(heightMeasureSpec));
    }

    private int measureWidth(int widthMeasureSpec) {
        int result = 0;
        int mode = MeasureSpec.getMode(widthMeasureSpec);
        int spaceSize = MeasureSpec.getSize(widthMeasureSpec);
        if (mode == MeasureSpec.EXACTLY) {
            result = spaceSize;
        } else {
            result = (int) (getLeftPaddingOffset() + getRightFadingEdgeStrength())
                    + 2 * mRadius * mCount + (mCount - 1) * mSpace;
            result = Math.min(result, spaceSize);
        }
        return result;
    }

    private int measureHeight(int heightMeasureSpec) {
        int result = 0;
        int mode = MeasureSpec.getMode(heightMeasureSpec);
        int spaceSize = MeasureSpec.getSize(heightMeasureSpec);
        if (mode == MeasureSpec.EXACTLY) {
            result = spaceSize;
        } else {
            result = (int) (getTopPaddingOffset() + getBottomFadingEdgeStrength()) + 2 * mRadius;
            result = Math.min(result, spaceSize);
        }
        return result;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        int left = (getWidth() - ((mRadius * 2 * mCount) + (mSpace * (mCount - 1)))) / 2;
        for (int i = 0; i < mCount; i++) {
            int x = getLeftPaddingOffset() + left + (mRadius * (i * 2 + 1)) + (mSpace * i);
            int color = mIndex == i ? mFocusColor : mNormalColor;
            paint.setColor(color);
            canvas.drawCircle(x, getHeight() / 2, mRadius, paint);
        }
    }
}
