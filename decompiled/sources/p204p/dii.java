package p204p;

import androidx.car.app.model.Alert;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class dii {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f49363a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new wii(false));

    /* JADX INFO: renamed from: b */
    public final n5q f49364b = xsr.f265651a;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f49365c = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new wii(true));

    /* JADX INFO: renamed from: d */
    public final qbn0 f49366d = new qbn0();

    /* JADX INFO: renamed from: e */
    public final x1e1 f49367e;

    /* JADX INFO: renamed from: f */
    public final gaz f49368f;

    /* JADX INFO: renamed from: g */
    public final d9p f49369g;

    /* JADX INFO: renamed from: h */
    public final int f49370h;

    /* JADX INFO: renamed from: i */
    public final int f49371i;

    /* JADX INFO: renamed from: j */
    public final int f49372j;

    /* JADX INFO: renamed from: k */
    public final int f49373k;

    /* JADX INFO: renamed from: l */
    public final boolean f49374l;

    /* JADX INFO: renamed from: m */
    public final tm4 f49375m;

    public dii(gl8 gl8Var) {
        x1e1 x1e1VarM45097l = gl8Var.m45097l();
        this.f49367e = x1e1VarM45097l == null ? diq.f49462a : x1e1VarM45097l;
        this.f49368f = gaz.f78129P0;
        this.f49369g = new d9p();
        this.f49370h = 4;
        this.f49371i = Alert.DURATION_SHOW_INDEFINITELY;
        this.f49373k = 20;
        this.f49372j = 8;
        this.f49374l = true;
        this.f49375m = new tm4(4);
    }
}
