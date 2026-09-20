package p204p;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Pane;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class mrm0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f146580a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f146581b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f146582c;

    /* JADX INFO: renamed from: d */
    public CarIcon f146583d;

    /* JADX INFO: renamed from: a */
    public final Pane m62644a() {
        if ((this.f146580a.size() > 0) != this.f146582c) {
            return new Pane(this);
        }
        throw new IllegalStateException("The pane is set to loading but is not empty, or vice versa");
    }
}
