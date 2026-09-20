package p204p;

import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public final class brq {

    /* JADX INFO: renamed from: a */
    public final xre f30159a;

    public /* synthetic */ brq(xre xreVar) {
        this.f30159a = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public String m30326a() {
        xre xreVar = this.f30159a;
        ((wy3) xreVar).getClass();
        TimeZone timeZone = TimeZone.getDefault();
        ((wy3) xreVar).getClass();
        int offset = (timeZone.getOffset(System.currentTimeMillis()) / 1000) / 60;
        return "timezone_".concat(n0e1.m63415W(String.format(Locale.ROOT, "%+03d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(offset / 60), Integer.valueOf(Math.abs(offset) % 60)}, 2)).getBytes(vuc.f244913a)));
    }
}
