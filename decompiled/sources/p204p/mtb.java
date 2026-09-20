package p204p;

import com.spotify.interapp.model.AppProtocol$Capabilities;
import com.spotify.interapp.model.AppProtocol$TokenResponse;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mtb implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f147011b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c19 f147012c;

    public /* synthetic */ mtb(c19 c19Var, int i, int i2) {
        this.f147010a = i2;
        this.f147012c = c19Var;
        this.f147011b = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f147010a) {
            case 0:
                ((otb) this.f147012c).m31248a(this.f147011b, new AppProtocol$Capabilities(Boolean.valueOf("premium".equals((String) obj))));
                break;
            default:
                c8m c8mVar = (c8m) this.f147012c;
                er7 er7Var = (er7) obj;
                boolean z = er7Var instanceof cr7;
                int i = this.f147011b;
                if (z) {
                    c8mVar.m31797f(((cr7) er7Var).f41196a, i);
                } else if (er7Var instanceof dr7) {
                    c8mVar.m31797f(zew.f282132Y, i);
                } else if (er7Var instanceof br7) {
                    c8mVar.m31797f(zew.f282141t, i);
                } else if (er7Var instanceof zq7) {
                    c8mVar.m31248a(i, new AppProtocol$TokenResponse(0, null, ((zq7) er7Var).f285319a));
                    c8mVar.f33023a.remove(Integer.valueOf(i));
                }
                break;
        }
    }
}
