package p204p;

import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class vbp {

    /* JADX INFO: renamed from: a */
    public final xre f239549a;

    public vbp(xre xreVar) {
        this.f239549a = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m85169a(long j) {
        ((wy3) this.f239549a).getClass();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeInMillis(j * ((long) 1000));
        if (calendar2.get(0) == calendar.get(0) && calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6)) {
            return 1;
        }
        if (calendar.get(1) == calendar2.get(1) && calendar2.get(6) - calendar.get(6) == 1) {
            return 3;
        }
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) - calendar2.get(6) == 1) {
            return 2;
        }
        int i = calendar.get(6) - calendar2.get(6);
        if (calendar.get(1) != calendar2.get(1) || i <= 0 || i > 7) {
            return calendar.get(1) == calendar2.get(1) ? 5 : 6;
        }
        return 4;
    }
}
