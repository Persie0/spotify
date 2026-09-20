package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class esc0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f62337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esc0(kqi0 kqi0Var, int i) {
        super(1);
        this.f62336a = i;
        this.f62337b = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f62336a;
        w2a1 w2a1Var = w2a1.f247311a;
        kqi0 kqi0Var = this.f62337b;
        switch (i) {
            case 0:
                kqi0Var.setValue((String) obj);
                return w2a1Var;
            case 1:
                kqi0Var.setValue((f6i0) obj);
                return w2a1Var;
            case 2:
                kqi0Var.setValue((String) obj);
                return w2a1Var;
            case 3:
                kqi0Var.setValue((String) obj);
                return w2a1Var;
            case 4:
                ((gh00) kqi0Var.getValue()).invoke(new tsc0((dvc1) obj));
                return w2a1Var;
            case 5:
                kqi0Var.setValue((f6i0) obj);
                return w2a1Var;
            case 6:
                ydj.m93453l(((jo70) obj).mo30006K(0L), kqi0Var);
                return w2a1Var;
            case 7:
                dvc1 dvc1Var = (dvc1) obj;
                ((gh00) kqi0Var.getValue()).invoke(new qxc0(dvc1Var.f53420a, dvc1Var.f53421b, dvc1Var.f53422c));
                return w2a1Var;
            case 8:
                ((gh00) kqi0Var.getValue()).invoke((String) obj);
                return w2a1Var;
            case 9:
                vc80 vc80Var = (vc80) obj;
                vc80Var.f240074c = new vi1(13, null, kqi0Var);
                vc80Var.f240075d = new in70(kqi0Var, 24);
                return w2a1Var;
            case 10:
                return new nfb(kqi0Var, 2);
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                kqi0Var.setValue(bool);
                return w2a1Var;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                kqi0Var.setValue(bool2);
                return w2a1Var;
            case 13:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                kqi0Var.setValue(bool3);
                return w2a1Var;
            case 14:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                kqi0Var.setValue(bool4);
                return w2a1Var;
            case 15:
                return new nfb(kqi0Var, 3);
            case 16:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                kqi0Var.setValue(bool5);
                return w2a1Var;
            case 17:
                float f = vue0.f244931a;
                kqi0Var.setValue((whu0) obj);
                return w2a1Var;
            case 18:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 19:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 20:
                kqi0Var.setValue(new g450(((g450) obj).f76347a));
                return w2a1Var;
            case 21:
                kqi0Var.setValue((tyf0) obj);
                return w2a1Var;
            case 22:
                kqi0Var.setValue((yzf0) obj);
                return w2a1Var;
            case 23:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                kqi0Var.setValue(bool6);
                return w2a1Var;
            case 24:
                kqi0Var.setValue(obj);
                return w2a1Var;
            case 25:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 26:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 27:
                kqi0Var.setValue(new t9j0((eh00) obj));
                return w2a1Var;
            case 28:
                kqi0Var.setValue(g6f.m43753y0((List) obj, "", null, null, null, 62));
                return w2a1Var;
            default:
                ((gh00) kqi0Var.getValue()).invoke((x3o0) obj);
                return w2a1Var;
        }
    }
}
