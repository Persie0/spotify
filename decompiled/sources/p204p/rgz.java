package p204p;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class rgz {

    /* JADX INFO: renamed from: e */
    public int f199054e;

    /* JADX INFO: renamed from: f */
    public int f199055f;

    /* JADX INFO: renamed from: g */
    public int f199056g;

    /* JADX INFO: renamed from: h */
    public int f199057h;

    /* JADX INFO: renamed from: i */
    public int f199058i;

    /* JADX INFO: renamed from: j */
    public float f199059j;

    /* JADX INFO: renamed from: k */
    public float f199060k;

    /* JADX INFO: renamed from: l */
    public int f199061l;

    /* JADX INFO: renamed from: m */
    public int f199062m;

    /* JADX INFO: renamed from: o */
    public int f199064o;

    /* JADX INFO: renamed from: p */
    public int f199065p;

    /* JADX INFO: renamed from: q */
    public boolean f199066q;

    /* JADX INFO: renamed from: r */
    public boolean f199067r;

    /* JADX INFO: renamed from: a */
    public int f199050a = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: b */
    public int f199051b = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: c */
    public int f199052c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f199053d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n */
    public final ArrayList f199063n = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final int m75490a() {
        return this.f199057h - this.f199058i;
    }

    /* JADX INFO: renamed from: b */
    public final void m75491b(View view, int i, int i2, int i3, int i4) {
        qgz qgzVar = (qgz) view.getLayoutParams();
        this.f199050a = Math.min(this.f199050a, (view.getLeft() - qgzVar.mo72770Z0()) - i);
        this.f199051b = Math.min(this.f199051b, (view.getTop() - qgzVar.mo72772c0()) - i2);
        this.f199052c = Math.max(this.f199052c, qgzVar.mo72777u1() + view.getRight() + i3);
        this.f199053d = Math.max(this.f199053d, qgzVar.mo72769Y0() + view.getBottom() + i4);
    }
}
