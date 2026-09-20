package p204p;

import android.content.SharedPreferences;
import com.ravelin.core.repository.p008db.AppDatabase;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class q2f1 implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184600a;

    /* JADX INFO: renamed from: b */
    public final h4t0 f184601b;

    /* JADX INFO: renamed from: c */
    public final h4t0 f184602c;

    /* JADX INFO: renamed from: d */
    public final h4t0 f184603d;

    /* JADX INFO: renamed from: e */
    public final h4t0 f184604e;

    public /* synthetic */ q2f1(Object obj, h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3, h4t0 h4t0Var4, int i) {
        this.f184600a = i;
        this.f184601b = h4t0Var;
        this.f184602c = h4t0Var2;
        this.f184603d = h4t0Var3;
        this.f184604e = h4t0Var4;
    }

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f184600a) {
            case 0:
                x2b x2bVar = (x2b) this.f184602c.get();
                hc50 hc50Var = (hc50) this.f184603d.get();
                hc50 hc50Var2 = (hc50) this.f184604e.get();
                y4l0 y4l0Var = new y4l0();
                if (hc50Var != null) {
                    y4l0Var.m92814a(hc50Var);
                }
                if (hc50Var2 != null) {
                    y4l0Var.m92814a(hc50Var2);
                }
                y4l0Var.f269183l = x2bVar;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                y4l0Var.m92815b(10L, timeUnit);
                y4l0Var.f269196y = c0f1.m31131b("timeout", 10L, timeUnit);
                return new z4l0(y4l0Var);
            default:
                return new nve((AppDatabase) this.f184601b.get(), (xd70) this.f184602c.get(), (clk0) this.f184603d.get(), (SharedPreferences) this.f184604e.get());
        }
    }
}
