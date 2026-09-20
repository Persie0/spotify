package p204p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l89 implements wa9 {

    /* JADX INFO: renamed from: a */
    public final ob21 f130825a;

    /* JADX INFO: renamed from: b */
    public final ly5 f130826b;

    /* JADX INFO: renamed from: c */
    public final d3b f130827c;

    public l89(z4l0 z4l0Var, File file, long j) {
        ob21 ob21Var = new ob21(file, new c080(j), null, true);
        this.f130825a = ob21Var;
        ly5 ly5Var = new ly5(1);
        this.f130826b = ly5Var;
        d3b d3bVar = new d3b();
        d3bVar.f44831a = ob21Var;
        d3bVar.f44833c = ly5Var;
        y0i0 y0i0Var = new y0i0((w8b) z4l0Var);
        y0i0Var.f267990c = null;
        d3bVar.f44835e = y0i0Var;
        this.f130827c = d3bVar;
    }

    @Override // p204p.wa9
    /* JADX INFO: renamed from: a */
    public final ob21 mo58462a() {
        return this.f130825a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58463b(String str) {
        boolean z;
        String strMo60230c = this.f130826b.mo60230c(new sjo(Uri.parse(str)));
        try {
            long jM56929a = kmj.m56929a(this.f130825a.m66594i(strMo60230c));
            if (jM56929a <= 0) {
                return false;
            }
            ob21 ob21Var = this.f130825a;
            synchronized (ob21Var) {
                c95.m31855u(!ob21Var.f163524i);
                w4b w4bVarM56065C = ob21Var.f163518c.m56065C(strMo60230c);
                z = w4bVarM56065C != null && w4bVarM56065C.m87179b(0L, jM56929a) >= jM56929a;
            }
            return z;
        } catch (Exception e) {
            Logger.m3974j(e, String.format("Unable to determine if media %s was cached.", Arrays.copyOf(new Object[]{str}, 1)), new Object[0]);
            return false;
        }
    }
}
