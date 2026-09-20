package androidx.car.app.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p204p.dve0;
import p204p.oe20;
import p204p.rzb;
import p204p.ty61;
import p204p.wdg1;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class MessageTemplate implements ty61 {
    private final List<Action> mActionList;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final CarText mDebugMessage;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final CarText mMessage;

    @Deprecated
    private final CarText mTitle;

    public MessageTemplate(dve0 dve0Var) {
        dve0Var.getClass();
        this.mIsLoading = false;
        this.mTitle = dve0Var.f53440a;
        this.mMessage = dve0Var.f53441b;
        this.mDebugMessage = dve0Var.f53442c;
        this.mIcon = dve0Var.f53443d;
        this.mHeaderAction = dve0Var.f53444e;
        this.mActionStrip = dve0Var.f53445f;
        this.mActionList = wdg1.m87845s(dve0Var.f53446g);
        this.mHeader = dve0Var.f53447h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip) && Objects.equals(this.mHeader, messageTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        List<Action> list = this.mActionList;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getDebugMessage() {
        return this.mDebugMessage;
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

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarText getMessage() {
        CarText carText = this.mMessage;
        Objects.requireNonNull(carText);
        return carText;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mMessage, this.mDebugMessage, this.mHeaderAction, this.mActionList, this.mIcon, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "MessageTemplate";
    }

    private MessageTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mMessage = null;
        this.mDebugMessage = null;
        this.mIcon = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mHeader = null;
    }
}
