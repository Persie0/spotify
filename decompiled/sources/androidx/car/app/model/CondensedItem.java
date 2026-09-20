package androidx.car.app.model;

import java.util.Objects;
import p204p.bhi;
import p204p.kr50;
import p204p.p7l0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class CondensedItem implements kr50 {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_SMALL = 2;
    private final boolean mIndexable;
    private final CarIcon mLeadingImage;
    private final int mLeadingImageType;
    private final p7l0 mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final CondensedItemStyle mStyle;
    private final CarText mText;
    private final CarText mTitle;
    private final CarIcon mTrailingImage;
    private final int mTrailingImageType;

    public /* synthetic */ CondensedItem(bhi bhiVar, int i) {
        this(bhiVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CondensedItem)) {
            return false;
        }
        CondensedItem condensedItem = (CondensedItem) obj;
        if (Objects.equals(this.mTitle, condensedItem.mTitle) && Objects.equals(this.mText, condensedItem.mText) && Objects.equals(this.mLeadingImage, condensedItem.mLeadingImage) && this.mLeadingImageType == condensedItem.mLeadingImageType && Objects.equals(this.mTrailingImage, condensedItem.mTrailingImage) && this.mTrailingImageType == condensedItem.mTrailingImageType && Objects.equals(this.mStyle, condensedItem.mStyle)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(condensedItem.mOnClickDelegate == null)) && this.mIndexable == condensedItem.mIndexable && Objects.equals(this.mProgressBar, condensedItem.mProgressBar)) {
                return true;
            }
        }
        return false;
    }

    public CarIcon getLeadingImage() {
        return this.mLeadingImage;
    }

    public int getLeadingImageType() {
        return this.mLeadingImageType;
    }

    public p7l0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public CondensedItemStyle getStyle() {
        return this.mStyle;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public CarIcon getTrailingImage() {
        return this.mTrailingImage;
    }

    public int getTrailingImageType() {
        return this.mTrailingImageType;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mLeadingImage, Integer.valueOf(this.mLeadingImageType), this.mTrailingImage, Integer.valueOf(this.mTrailingImageType), this.mStyle, this.mOnClickDelegate, this.mProgressBar);
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public String toString() {
        return "CondensedItem { title: " + this.mTitle + ", text: " + this.mText + ", leadingImage: " + this.mLeadingImage + ", leadingImageType: " + this.mLeadingImageType + ", trailingImage: " + this.mTrailingImage + ", trailingImageType: " + this.mTrailingImageType + ", style: " + this.mStyle + ", onClickDelegate: " + this.mOnClickDelegate + ", progressBar: " + this.mProgressBar + " }";
    }

    private CondensedItem(bhi bhiVar) {
        this.mTitle = bhiVar.f27185a;
        this.mText = null;
        this.mLeadingImage = bhiVar.f27186b;
        this.mLeadingImageType = bhiVar.f27187c;
        this.mTrailingImage = bhiVar.f27188d;
        this.mTrailingImageType = bhiVar.f27189e;
        this.mStyle = bhiVar.f27190f;
        this.mOnClickDelegate = bhiVar.f27191g;
        this.mProgressBar = bhiVar.f27192h;
        this.mIndexable = bhiVar.f27193i;
    }

    private CondensedItem() {
        this.mTitle = null;
        this.mText = null;
        this.mLeadingImage = null;
        this.mLeadingImageType = 2;
        this.mTrailingImage = null;
        this.mTrailingImageType = 2;
        this.mStyle = null;
        this.mOnClickDelegate = null;
        this.mProgressBar = null;
        this.mIndexable = true;
    }
}
