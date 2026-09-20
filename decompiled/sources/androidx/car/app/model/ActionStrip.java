package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.rzb;
import p204p.w60;
import p204p.wdg1;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class ActionStrip {
    private final List<Action> mActions;

    public ActionStrip(w60 w60Var) {
        this.mActions = wdg1.m87845s(w60Var.f248219a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionStrip) {
            return Objects.equals(this.mActions, ((ActionStrip) obj).mActions);
        }
        return false;
    }

    public List<Action> getActions() {
        List<Action> list = this.mActions;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Action getFirstActionOfType(int i) {
        for (Action action : this.mActions) {
            if (action instanceof Action) {
                Action action2 = action;
                if (action2.getType() == i) {
                    return action2;
                }
            }
        }
        return null;
    }

    public int hashCode() {
        return Objects.hashCode(this.mActions);
    }

    public String toString() {
        return "[action count: " + this.mActions.size() + "]";
    }

    private ActionStrip() {
        this.mActions = Collections.EMPTY_LIST;
    }
}
