package p204p;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;

/* JADX INFO: loaded from: classes3.dex */
public final class sze1 {

    /* JADX INFO: renamed from: a */
    public final wcb f215550a;

    /* JADX INFO: renamed from: b */
    public final tze1 f215551b;

    /* JADX INFO: renamed from: c */
    public final xoi0 f215552c;

    /* JADX INFO: renamed from: d */
    public final rze1 f215553d;

    /* JADX INFO: renamed from: e */
    public boolean f215554e = false;

    /* JADX INFO: renamed from: f */
    public final qze1 f215555f = new qze1(this);

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public sze1(wcb wcbVar, peb pebVar, htz0 htz0Var) {
        Range range;
        rze1 in4Var;
        this.f215550a = wcbVar;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) pebVar.m69715a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                vie1.m85618G("ZoomControl");
                range = null;
            }
            if (range != null) {
                in4Var = new in4(pebVar);
            } else {
                in4Var = new c9a(pebVar, 20);
            }
        } else {
            in4Var = new c9a(pebVar, 20);
        }
        this.f215553d = in4Var;
        tze1 tze1Var = new tze1(in4Var.mo31911j(), in4Var.mo31907d());
        this.f215551b = tze1Var;
        tze1Var.m82072e();
        this.f215552c = new xoi0(new c18(tze1Var.m82071d(), tze1Var.m82069b(), tze1Var.m82070c(), tze1Var.m82068a()));
        wcbVar.m87717h(this.f215555f);
    }
}
