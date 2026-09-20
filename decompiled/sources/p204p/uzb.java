package p204p;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.car.app.model.TimerSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uzb {

    /* JADX INFO: renamed from: b */
    public static final uzb f235454b = new uzb(Collections.EMPTY_LIST);

    /* JADX INFO: renamed from: c */
    public static final uzb f235455c = new uzb(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));

    /* JADX INFO: renamed from: d */
    public static final uzb f235456d;

    /* JADX INFO: renamed from: e */
    public static final uzb f235457e;

    /* JADX INFO: renamed from: f */
    public static final uzb f235458f;

    /* JADX INFO: renamed from: g */
    public static final uzb f235459g;

    /* JADX INFO: renamed from: a */
    public final HashSet f235460a;

    static {
        new uzb(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class));
        f235456d = new uzb(Arrays.asList(ForegroundCarColorSpan.class));
        f235457e = new uzb(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class));
        f235458f = new uzb(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, CarIconSpan.class));
        new uzb(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));
        f235459g = new uzb(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public uzb(List list) {
        this.f235460a = new HashSet(list);
    }

    /* JADX INFO: renamed from: a */
    public final void m84292a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.f235460a.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m84293b(CarText carText) {
        m84292a(carText.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            m84292a(it.next());
        }
    }
}
