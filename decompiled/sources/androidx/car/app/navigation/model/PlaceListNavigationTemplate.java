package androidx.car.app.navigation.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import java.util.Objects;
import p204p.irm0;
import p204p.q5o0;
import p204p.rzb;
import p204p.ty61;
import p204p.u7l0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
@Deprecated
public final class PlaceListNavigationTemplate implements ty61 {
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final ActionStrip mMapActionStrip;
    private final u7l0 mOnContentRefreshDelegate;
    private final irm0 mPanModeDelegate;

    @Deprecated
    private final CarText mTitle;

    public PlaceListNavigationTemplate(q5o0 q5o0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListNavigationTemplate)) {
            return false;
        }
        PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj;
        if (this.mIsLoading == placeListNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, placeListNavigationTemplate.mTitle) && Objects.equals(this.mItemList, placeListNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, placeListNavigationTemplate.mMapActionStrip)) {
            if (Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(placeListNavigationTemplate.mPanModeDelegate == null))) {
                if (Boolean.valueOf(this.mOnContentRefreshDelegate == null).equals(Boolean.valueOf(placeListNavigationTemplate.mOnContentRefreshDelegate == null)) && Objects.equals(this.mHeader, placeListNavigationTemplate.mHeader)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public u7l0 getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    public irm0 getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Boolean.valueOf(this.mIsLoading), this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(this.mOnContentRefreshDelegate == null), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "PlaceListNavigationTemplate";
    }

    private PlaceListNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
        this.mOnContentRefreshDelegate = null;
    }
}
