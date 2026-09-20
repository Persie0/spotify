package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.ht8;
import p204p.kr50;
import p204p.p7l0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Banner implements kr50 {
    private static final int MAX_TRAILING_ELEMENTS = 2;
    private final Background mBackground;
    private final List<Action> mBelowActions;
    private final BannerElement mLeadingElement;
    private final p7l0 mOnClickDelegate;
    private final CarText mSubtitle;
    private final CarText mTitle;
    private final List<BannerElement> mTrailingElements;

    public Banner(ht8 ht8Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj;
        if (Objects.equals(this.mTitle, banner.mTitle) && Objects.equals(this.mSubtitle, banner.mSubtitle)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(banner.mOnClickDelegate == null)) && Objects.equals(this.mBackground, banner.mBackground) && Objects.equals(this.mLeadingElement, banner.mLeadingElement) && Objects.equals(this.mTrailingElements, banner.mTrailingElements) && Objects.equals(this.mBelowActions, banner.mBelowActions)) {
                return true;
            }
        }
        return false;
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public List<Action> getBelowActions() {
        return this.mBelowActions;
    }

    public BannerElement getLeadingElement() {
        return this.mLeadingElement;
    }

    public p7l0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public List<BannerElement> getTrailingElements() {
        return this.mTrailingElements;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, Boolean.valueOf(this.mOnClickDelegate == null), this.mBackground, this.mLeadingElement, this.mTrailingElements, this.mBelowActions);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[title: ");
        sb.append(CarText.toShortString(this.mTitle));
        sb.append(", subtitle: ");
        sb.append(CarText.toShortString(this.mSubtitle));
        sb.append(", has click listener: ");
        sb.append(this.mOnClickDelegate != null);
        sb.append(", background color: ");
        sb.append(this.mBackground);
        sb.append(", leading element: ");
        sb.append(this.mLeadingElement);
        sb.append(", trailing elements: ");
        sb.append(this.mTrailingElements);
        sb.append(", below actions: ");
        sb.append(this.mBelowActions);
        sb.append("]");
        return sb.toString();
    }

    private Banner() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mOnClickDelegate = null;
        this.mBackground = null;
        this.mLeadingElement = null;
        List list = Collections.EMPTY_LIST;
        this.mTrailingElements = list;
        this.mBelowActions = list;
    }
}
