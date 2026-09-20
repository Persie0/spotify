package androidx.car.app.model;

import java.util.Objects;
import p204p.kr50;
import p204p.p7l0;
import p204p.rzb;
import p204p.sz10;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class GridItem implements kr50 {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 2;
    private final Badge mBadge;
    private final CarIcon mImage;
    private final int mImageType;
    private final boolean mIndexable;
    private final boolean mIsLoading;
    private final p7l0 mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final CarText mText;
    private final CarText mTitle;

    public GridItem(sz10 sz10Var) {
        sz10Var.getClass();
        this.mIsLoading = false;
        this.mTitle = sz10Var.f215362a;
        this.mText = sz10Var.f215363b;
        this.mImage = sz10Var.f215364c;
        this.mImageType = 2;
        this.mOnClickDelegate = sz10Var.f215365d;
        this.mBadge = null;
        this.mIndexable = true;
        this.mProgressBar = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridItem)) {
            return false;
        }
        GridItem gridItem = (GridItem) obj;
        if (this.mIsLoading == gridItem.mIsLoading && Objects.equals(this.mTitle, gridItem.mTitle) && Objects.equals(this.mText, gridItem.mText) && Objects.equals(this.mImage, gridItem.mImage)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(gridItem.mOnClickDelegate == null)) && Objects.equals(this.mBadge, gridItem.mBadge) && this.mImageType == gridItem.mImageType && this.mIndexable == gridItem.mIndexable && Objects.equals(this.mProgressBar, gridItem.mProgressBar)) {
                return true;
            }
        }
        return false;
    }

    public Badge getBadge() {
        return this.mBadge;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public int getImageType() {
        return this.mImageType;
    }

    public p7l0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mImage, Integer.valueOf(this.mImageType), Boolean.valueOf(this.mOnClickDelegate == null), this.mBadge, Boolean.valueOf(this.mIndexable), this.mProgressBar);
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "[title: " + CarText.toShortString(this.mTitle) + ", text: " + CarText.toShortString(this.mText) + ", image: " + this.mImage + ", isLoading: " + this.mIsLoading + ", badge: " + this.mBadge + ", progressBar: " + this.mProgressBar + "]";
    }

    private GridItem() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
        this.mImageType = 2;
        this.mOnClickDelegate = null;
        this.mBadge = null;
        this.mIndexable = true;
        this.mProgressBar = null;
    }
}
