package androidx.car.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p204p.oe20;
import p204p.rzb;
import p204p.wdg1;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Header {
    private final Background mBackground;
    private final List<Action> mEndHeaderActions;
    private final Action mStartHeaderAction;
    private final CarText mSubtitle;
    private final CarText mTitle;

    public Header(oe20 oe20Var) {
        this.mTitle = oe20Var.f164323c;
        this.mSubtitle = null;
        this.mStartHeaderAction = oe20Var.f164322b;
        this.mEndHeaderActions = wdg1.m87845s(oe20Var.f164321a);
        this.mBackground = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mSubtitle, header.mSubtitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction) && Objects.equals(this.mBackground, header.mBackground);
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public List<Action> getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, this.mEndHeaderActions, this.mStartHeaderAction, this.mBackground);
    }

    public String toString() {
        return "Header: " + this.mTitle + ", Subtitle: " + this.mSubtitle + ", Background: " + this.mBackground;
    }

    private Header() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new ArrayList();
        this.mBackground = null;
    }
}
