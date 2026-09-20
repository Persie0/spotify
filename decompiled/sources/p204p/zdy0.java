package p204p;

/* JADX INFO: loaded from: classes5.dex */
public interface zdy0 extends Comparable {
    @Override // java.lang.Comparable
    default int compareTo(Object obj) {
        zdy0 zdy0Var = (zdy0) obj;
        if (equals(zdy0Var)) {
            return 0;
        }
        ydy0 ydy0Var = ydy0.f271879a;
        if (equals(ydy0Var)) {
            return 1;
        }
        wdy0 wdy0Var = wdy0.f250383a;
        if (zdy0Var.equals(wdy0Var)) {
            return 1;
        }
        if (equals(wdy0Var) || zdy0Var.equals(ydy0Var)) {
            return -1;
        }
        return ((xdy0) this).f260570a > ((xdy0) zdy0Var).f260570a ? 1 : -1;
    }
}
