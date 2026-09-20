package p204p;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class oe20 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f164321a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Action f164322b;

    /* JADX INFO: renamed from: c */
    public CarText f164323c;

    /* JADX INFO: renamed from: a */
    public final void m66784a(Action action) {
        Objects.requireNonNull(action);
        this.f164321a.add(action);
    }

    /* JADX INFO: renamed from: b */
    public final Header m66785b() {
        if (CarText.isNullOrEmpty(this.f164323c) && this.f164322b == null) {
            throw new IllegalStateException("Either the title or start header action must be set");
        }
        return new Header(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m66786c(Action action) {
        n80 n80Var = n80.f151278l;
        Objects.requireNonNull(action);
        n80Var.m63817a(Collections.singletonList(action));
        this.f164322b = action;
    }

    /* JADX INFO: renamed from: d */
    public final void m66787d(CarText carText) {
        Objects.requireNonNull(carText);
        this.f164323c = carText;
        uzb.f235457e.m84293b(carText);
    }
}
