package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class sxi {

    /* JADX INFO: renamed from: a */
    public final Set f214897a;

    /* JADX INFO: renamed from: b */
    public final HashMap f214898b = new HashMap(5);

    public sxi(hg40 hg40Var) {
        this.f214897a = hg40Var;
    }

    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryDescription m79644a(String str) {
        if (str == null) {
            ykn yknVar = new ykn(null);
            yknVar.m94059f1("app_to_app");
            yknVar.m94056d1("media_session");
            yknVar.m94057e1(str);
            return yknVar.m93999A();
        }
        ExternalAccessoryDescription externalAccessoryDescription = (ExternalAccessoryDescription) this.f214898b.get(str);
        if (externalAccessoryDescription != null) {
            return externalAccessoryDescription;
        }
        for (fod0 fod0Var : this.f214897a) {
            if (fod0Var.mo42271b(str)) {
                return fod0Var.mo42270a(str);
            }
        }
        ykn yknVar2 = new ykn(null);
        yknVar2.m94059f1("app_to_app");
        yknVar2.m94056d1("media_session");
        yknVar2.m94057e1(str);
        return yknVar2.m93999A();
    }
}
