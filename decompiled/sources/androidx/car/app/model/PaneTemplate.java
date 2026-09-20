package androidx.car.app.model;

import java.util.Iterator;
import java.util.Objects;
import p204p.oe20;
import p204p.rzb;
import p204p.srm0;
import p204p.ty61;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class PaneTemplate implements ty61 {

    @Deprecated
    private final ActionStrip mActionStrip;
    private final Banner mBanner;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final Pane mPane;

    @Deprecated
    private final CarText mTitle;

    public PaneTemplate(srm0 srm0Var) {
        this.mTitle = srm0Var.f213357a;
        this.mPane = srm0Var.f213358b;
        this.mHeaderAction = srm0Var.f213359c;
        this.mActionStrip = srm0Var.f213360d;
        this.mHeader = srm0Var.f213361e;
        this.mBanner = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip) && Objects.equals(this.mHeader, paneTemplate.mHeader) && Objects.equals(this.mBanner, paneTemplate.mBanner);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Banner getBanner() {
        return this.mBanner;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        oe20 oe20Var = new oe20();
        CarText carText = this.mTitle;
        if (carText != null) {
            oe20Var.m66787d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            oe20Var.m66786c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                oe20Var.m66784a(it.next());
            }
        }
        return oe20Var.m66785b();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public Pane getPane() {
        Pane pane = this.mPane;
        Objects.requireNonNull(pane);
        return pane;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip, this.mHeader, this.mBanner);
    }

    public String toString() {
        return "PaneTemplate";
    }

    private PaneTemplate() {
        this.mTitle = null;
        this.mPane = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mHeader = null;
        this.mBanner = null;
    }
}
