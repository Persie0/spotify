package p204p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class ji50 implements h40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112661a;

    /* JADX INFO: renamed from: b */
    public final m500 f112662b;

    /* JADX INFO: renamed from: c */
    public final v1e f112663c;

    /* JADX INFO: renamed from: d */
    public final iv91 f112664d;

    public /* synthetic */ ji50(m500 m500Var, v1e v1eVar, iv91 iv91Var, int i) {
        this.f112661a = i;
        this.f112662b = m500Var;
        this.f112663c = v1eVar;
        this.f112664d = iv91Var;
    }

    @Override // p204p.h40
    /* JADX INFO: renamed from: a */
    public final void mo28852a(String str, String str2, Bundle bundle, h7l0 h7l0Var) {
        switch (this.f112661a) {
            case 0:
                h7l0Var.invoke(Boolean.TRUE);
                Serializable serializable = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                d850 d850Var = serializable instanceof d850 ? (d850) serializable : null;
                Uri uri = Uri.parse(str2);
                hv91 hv91VarM51740c = d850Var != null ? this.f112664d.m51740c(uri, d850Var) : null;
                m500 m500Var = this.f112662b;
                o1e o1eVar = new o1e(m500Var.getString(R.string.iam_internal_webview_title));
                if (hv91VarM51740c != null) {
                    uri = hv91VarM51740c.f95635a;
                }
                m500Var.startActivity(this.f112663c.m84461a(m500Var, new q1e(s0e.f204363b, o1eVar, uri)));
                if (hv91VarM51740c != null) {
                    hv91VarM51740c.m48760a();
                }
                break;
            default:
                h7l0Var.invoke(Boolean.TRUE);
                Uri uri2 = Uri.parse("https://www.spotify.com/account/profile-mobile");
                Serializable serializable2 = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                d850 d850Var2 = serializable2 instanceof d850 ? (d850) serializable2 : null;
                hv91 hv91VarM51740c2 = d850Var2 != null ? this.f112664d.m51740c(uri2, d850Var2) : null;
                m500 m500Var2 = this.f112662b;
                o1e o1eVar2 = new o1e(m500Var2.getString(R.string.iam_internal_webview_title));
                if (hv91VarM51740c2 != null) {
                    uri2 = hv91VarM51740c2.f95635a;
                }
                m500Var2.startActivity(this.f112663c.m84461a(m500Var2, new q1e(s0e.f204363b, o1eVar2, uri2)));
                if (hv91VarM51740c2 != null) {
                    hv91VarM51740c2.m48760a();
                }
                break;
        }
    }
}
