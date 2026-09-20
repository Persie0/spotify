package p204p;

import android.view.autofill.AutofillManager;
import com.google.firebase.components.ComponentRegistrar;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: p.nf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2162nf implements v3b, d2s, zwf, z591, lir {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153190a;

    public /* synthetic */ C2162nf(int i) {
        this.f153190a = i;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ AutofillManager m64313f(Object obj) {
        return (AutofillManager) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ Class m64314g() {
        return AutofillManager.class;
    }

    @Override // p204p.zwf
    /* JADX INFO: renamed from: a */
    public List mo35061a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // p204p.z591
    public Object apply(Object obj) {
        zko.f283788b.getClass();
        return k4l.f119245a.m25644j((g4l) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // p204p.d2s
    /* JADX INFO: renamed from: b */
    public double mo34792b(double d) {
        switch (this.f153190a) {
            case 20:
                float[] fArr = c9f.f35490a;
                return c9f.m31922d(c9f.f35493d, d);
            case 21:
                float[] fArr2 = c9f.f35490a;
                return c9f.m31921c(c9f.f35493d, d);
            case 22:
                return fgg1.m41592g(d);
            case 23:
                return fgg1.m41593h(d);
            case 24:
                float[] fArr3 = c9f.f35490a;
                return c9f.m31920b(c9f.f35492c, d);
            default:
                float[] fArr4 = c9f.f35490a;
                return c9f.m31919a(c9f.f35492c, d);
        }
    }

    @Override // p204p.v3b
    /* JADX INFO: renamed from: c */
    public String mo60230c(sjo sjoVar) {
        String str = sjoVar.f209892h;
        return str != null ? str : sjoVar.f209885a.toString();
    }

    @Override // p204p.lir
    public boolean test(Object obj, Object obj2) {
        return !obj2.equals(obj);
    }
}
