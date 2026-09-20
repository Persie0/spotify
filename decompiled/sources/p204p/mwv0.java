package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class mwv0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pcw f147889b;

    public /* synthetic */ mwv0(pcw pcwVar, int i) {
        this.f147888a = i;
        this.f147889b = pcwVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f147888a) {
            case 0:
                String str = (String) g6f.m43741q0((List) obj);
                pcw pcwVar = this.f147889b;
                ((l2j0) pcwVar.f176244c).m57905a(str, ((gtp) pcwVar.f176245d).mo32684b(yf81.f272180b, str));
                break;
            default:
                String str2 = (String) obj;
                pcw pcwVar2 = this.f147889b;
                ((l2j0) pcwVar2.f176244c).m57905a(str2, ((gtp) pcwVar2.f176245d).mo32684b(yf81.f272179a, str2));
                break;
        }
    }
}
