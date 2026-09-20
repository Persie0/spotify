package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.kr50;
import p204p.p7l0;
import p204p.rzb;
import p204p.wdg1;
import p204p.znx0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Row implements kr50 {
    public static final int IMAGE_TYPE_EXTRA_SMALL = 8;
    public static final int IMAGE_TYPE_ICON = 4;
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_MEDIUM = 16;
    public static final int IMAGE_TYPE_SMALL = 1;
    public static final int NO_DECORATION = -1;
    private static final String YOUR_BOAT = "🚣";
    private final List<Action> mActions;
    private final CarIcon mEndImage;
    private final CarIcon mImage;
    private final boolean mIndexable;
    private final boolean mIsBrowsable;
    private final boolean mIsEnabled;
    private final Metadata mMetadata;
    private final int mNumericDecoration;
    private final p7l0 mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final int mRowEndImageType;
    private final int mRowImageType;
    private final List<CarText> mTexts;
    private final CarText mTitle;
    private final Toggle mToggle;

    public Row(znx0 znx0Var) {
        this.mTitle = znx0Var.f284586b;
        this.mTexts = wdg1.m87845s(znx0Var.f284587c);
        this.mImage = znx0Var.f284588d;
        this.mEndImage = null;
        this.mActions = wdg1.m87845s(znx0Var.f284589e);
        this.mNumericDecoration = znx0Var.f284590f;
        this.mToggle = null;
        this.mOnClickDelegate = znx0Var.f284591g;
        this.mMetadata = znx0Var.f284592h;
        this.mIsBrowsable = znx0Var.f284593i;
        this.mRowImageType = znx0Var.f284594j;
        this.mRowEndImageType = znx0Var.f284595k;
        this.mIsEnabled = znx0Var.f284585a;
        this.mIndexable = znx0Var.f284596l;
        this.mProgressBar = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        if (Objects.equals(this.mTitle, row.mTitle) && Objects.equals(this.mTexts, row.mTexts) && Objects.equals(this.mImage, row.mImage) && Objects.equals(this.mEndImage, row.mEndImage) && Objects.equals(this.mToggle, row.mToggle)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(row.mOnClickDelegate == null)) && Objects.equals(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType && this.mRowEndImageType == row.mRowEndImageType && this.mIsEnabled == row.isEnabled() && this.mIndexable == row.mIndexable && Objects.equals(this.mProgressBar, row.mProgressBar)) {
                return true;
            }
        }
        return false;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public CarIcon getEndImage() {
        return this.mEndImage;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public Metadata getMetadata() {
        return this.mMetadata;
    }

    public int getNumericDecoration() {
        return this.mNumericDecoration;
    }

    public p7l0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public int getRowEndImageType() {
        return this.mRowEndImageType;
    }

    public int getRowImageType() {
        return this.mRowImageType;
    }

    public List<CarText> getTexts() {
        List<CarText> list = this.mTexts;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public Toggle getToggle() {
        return this.mToggle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mTexts, this.mImage, this.mEndImage, this.mToggle, Boolean.valueOf(this.mOnClickDelegate == null), this.mMetadata, Boolean.valueOf(this.mIsBrowsable), Integer.valueOf(this.mRowImageType), Integer.valueOf(this.mRowEndImageType), Boolean.valueOf(this.mIsEnabled), Boolean.valueOf(this.mIndexable), this.mProgressBar);
    }

    public boolean isBrowsable() {
        return this.mIsBrowsable;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public Row row() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[title: ");
        sb.append(CarText.toShortString(this.mTitle));
        sb.append(", text count: ");
        List<CarText> list = this.mTexts;
        sb.append(list != null ? list.size() : 0);
        sb.append(", image: ");
        sb.append(this.mImage);
        sb.append(", endImage: ");
        sb.append(this.mEndImage);
        sb.append(", isBrowsable: ");
        sb.append(this.mIsBrowsable);
        sb.append(", isEnabled: ");
        sb.append(this.mIsEnabled);
        sb.append(", progressBar: ");
        sb.append(this.mProgressBar);
        sb.append("]");
        return sb.toString();
    }

    public CharSequence yourBoat() {
        return YOUR_BOAT;
    }

    private Row() {
        this.mTitle = null;
        List list = Collections.EMPTY_LIST;
        this.mTexts = list;
        this.mImage = null;
        this.mEndImage = null;
        this.mActions = list;
        this.mNumericDecoration = -1;
        this.mToggle = null;
        this.mOnClickDelegate = null;
        this.mMetadata = Metadata.EMPTY_METADATA;
        this.mIsBrowsable = false;
        this.mRowImageType = 1;
        this.mRowEndImageType = 1;
        this.mIsEnabled = true;
        this.mIndexable = true;
        this.mProgressBar = null;
    }
}
