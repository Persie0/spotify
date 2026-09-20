package p204p;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class srm0 {

    /* JADX INFO: renamed from: a */
    public CarText f213357a;

    /* JADX INFO: renamed from: b */
    public Pane f213358b;

    /* JADX INFO: renamed from: c */
    public Action f213359c;

    /* JADX INFO: renamed from: d */
    public ActionStrip f213360d;

    /* JADX INFO: renamed from: e */
    public Header f213361e;

    /* JADX INFO: renamed from: a */
    public final PaneTemplate m79119a() {
        frx0 frx0Var = frx0.f72674d;
        Pane pane = this.f213358b;
        frx0Var.getClass();
        int size = pane.getActions().size();
        int i = frx0Var.f72676a;
        if (size > i) {
            throw new IllegalArgumentException(s571.m77246e(i, "The number of actions on the pane exceeded the supported max of "));
        }
        frx0Var.m42515a(pane.getRows());
        n80.f151279m.m63817a(pane.getActions());
        return new PaneTemplate(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m79120b(Header header) {
        if (header.getStartHeaderAction() != null) {
            this.f213359c = header.getStartHeaderAction();
        }
        if (header.getTitle() != null) {
            this.f213357a = header.getTitle();
        }
        if (!header.getEndHeaderActions().isEmpty()) {
            w60 w60Var = new w60();
            Iterator<Action> it = header.getEndHeaderActions().iterator();
            while (it.hasNext()) {
                w60Var.m87265a(it.next());
            }
            if (w60Var.f248219a.isEmpty()) {
                throw new IllegalStateException("Action strip must contain at least one action");
            }
            this.f213360d = new ActionStrip(w60Var);
        }
        this.f213361e = header;
    }
}
