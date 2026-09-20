package p204p;

import android.content.Context;
import android.view.View;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class zkh extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283762a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f283763b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f283764c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f283765d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f283766e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f283767f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f283768g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkh(nju njuVar, js20 js20Var, int i, kqi0 kqi0Var, gh00 gh00Var, gh00 gh00Var2) {
        super(1);
        this.f283766e = njuVar;
        this.f283767f = js20Var;
        this.f283763b = i;
        this.f283764c = kqi0Var;
        this.f283765d = gh00Var;
        this.f283768g = gh00Var2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:28:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        aa71 aa71Var;
        int i = this.f283762a;
        int i2 = this.f283763b;
        Object obj2 = null;
        kqi0 kqi0Var = this.f283764c;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj3 = this.f283767f;
        Object obj4 = this.f283768g;
        Object obj5 = this.f283765d;
        Object obj6 = this.f283766e;
        switch (i) {
            case 0:
                xka0 xka0Var = (xka0) obj4;
                d510 d510Var = (d510) obj3;
                int iOrdinal = ((jla0) obj).ordinal();
                if (iOrdinal == 0) {
                    ((xh70) obj6).m90964v(new q650(i2, xka0Var.f262318c == 2 ? 2 : 1, 2, d510Var.f45298a));
                    if (xka0Var.f262318c == 2) {
                        kqi0Var.setValue(d510Var);
                    } else {
                        ((gh00) obj5).invoke(new vja0(d510Var));
                    }
                } else if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1Var;
            case 1:
                ovf ovfVarMo26174a = ((nju) obj6).mo26174a(fo81.f71471a);
                kqi0Var.setValue(ovfVarMo26174a);
                js20 js20Var = (js20) obj3;
                ovfVarMo26174a.mo2820d(new hn81(js20Var.f115366b, js20Var.f115367c, new h66(js20Var.f115368d), null, null, null, this.f283763b, false, false, false, null, 2096888));
                View view = ovfVarMo26174a.getView();
                mec1.m61561m(view, C2212of.f164591g, ((Context) obj).getString(R.string.timeline_track_accessibility_label), mzx.f148827e);
                mec1.m61564p(view, new usa(13));
                ovfVarMo26174a.mo2821c(new k0w((gh00) obj5, js20Var, (gh00) obj4, 27));
                return view;
            case 2:
                long j = ((Offset) obj).f493a;
                eh00 eh00Var = (eh00) obj4;
                ae71 ae71Var = (ae71) obj6;
                if (ae71Var.m25702b()) {
                    ae71Var.m25701a();
                    rsu0 rsu0Var = isu0.f105317a;
                    kqi0Var.setValue(null);
                } else {
                    rsu0 rsu0Var2 = isu0.f105317a;
                    if (((aa71) kqi0Var.getValue()) != null) {
                        ae71Var.m25701a();
                        rsu0 rsu0Var3 = isu0.f105317a;
                        kqi0Var.setValue(null);
                    } else {
                        db71 db71Var = (db71) ((kqi0) obj5).getValue();
                        if (db71Var != null) {
                            int iM95500g = i2 + db71Var.f47231b.m95500g(j);
                            for (Object obj7 : (Iterable) ((gl40) obj3).f80991a.getValue()) {
                                aa71 aa71Var2 = (aa71) obj7;
                                int i3 = aa71Var2.f13779a;
                                if (iM95500g < aa71Var2.f13780b && i3 <= iM95500g) {
                                    obj2 = obj7;
                                    aa71Var = (aa71) obj2;
                                    if (aa71Var != null) {
                                        kqi0Var.setValue(aa71Var);
                                    } else {
                                        eh00Var.invoke();
                                    }
                                }
                            }
                            aa71Var = (aa71) obj2;
                            if (aa71Var != null) {
                                kqi0Var.setValue(aa71Var);
                            } else {
                                eh00Var.invoke();
                            }
                        } else {
                            eh00Var.invoke();
                        }
                    }
                }
                return w2a1Var;
            default:
                uw70 uw70Var = (uw70) obj;
                uw70.m84090b(uw70Var, ((AbstractC2282q6) ((qf40) obj6)).mo33075a(), null, new fyf(new h271((qf40) obj6, this.f283763b, (gh00) obj5, (String) obj4, this.f283764c), true, 673735423), 6);
                String str = (String) obj3;
                if (str != null && str.length() != 0) {
                    uw70.m84091c(uw70Var, "provider_credit", new fyf(new re01(str, 14), true, 117507089), 2);
                }
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkh(qf40 qf40Var, String str, int i, gh00 gh00Var, String str2, kqi0 kqi0Var) {
        super(1);
        this.f283766e = qf40Var;
        this.f283767f = str;
        this.f283763b = i;
        this.f283765d = gh00Var;
        this.f283768g = str2;
        this.f283764c = kqi0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkh(xh70 xh70Var, d510 d510Var, int i, xka0 xka0Var, gh00 gh00Var, kqi0 kqi0Var) {
        super(1);
        this.f283766e = xh70Var;
        this.f283767f = d510Var;
        this.f283763b = i;
        this.f283768g = xka0Var;
        this.f283765d = gh00Var;
        this.f283764c = kqi0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkh(ae71 ae71Var, int i, gl40 gl40Var, eh00 eh00Var, kqi0 kqi0Var, kqi0 kqi0Var2) {
        super(1);
        this.f283766e = ae71Var;
        this.f283763b = i;
        this.f283767f = gl40Var;
        this.f283768g = eh00Var;
        this.f283764c = kqi0Var;
        this.f283765d = kqi0Var2;
    }
}
