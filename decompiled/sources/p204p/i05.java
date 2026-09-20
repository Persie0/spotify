package p204p;

import com.spotify.carapplibrary.app.instrumentation.events.proto.CalImageLoadingError;
import com.spotify.widget.eventloggerimpl.events.proto.WidgetLifecycleEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class i05 {

    /* JADX INFO: renamed from: a */
    public final qre0 f97137a;

    public /* synthetic */ i05(qre0 qre0Var) {
        this.f97137a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m49295a(String str, String str2) {
        g7b g7bVarM5538p = CalImageLoadingError.m5538p();
        g7bVarM5538p.m43802q(str);
        g7bVarM5538p.m43801m(str2);
        CalImageLoadingError calImageLoadingError = (CalImageLoadingError) g7bVarM5538p.build();
        wj50.m88279p(calImageLoadingError);
        this.f97137a.m73616a(calImageLoadingError);
    }

    /* JADX INFO: renamed from: b */
    public void m49296b() {
        ntd1 ntd1VarM23057p = WidgetLifecycleEvent.m23057p();
        ntd1VarM23057p.m65614m(j4x.m52404b(1));
        this.f97137a.m73616a(ntd1VarM23057p.build());
    }

    /* JADX INFO: renamed from: c */
    public void m49297c(int[] iArr) {
        for (int i : iArr) {
            ntd1 ntd1VarM23057p = WidgetLifecycleEvent.m23057p();
            ntd1VarM23057p.m65614m(j4x.m52404b(2));
            ntd1VarM23057p.m65615q(i);
            this.f97137a.m73616a(ntd1VarM23057p.build());
        }
    }
}
