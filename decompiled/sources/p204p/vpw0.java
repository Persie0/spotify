package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vpw0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final vpw0 f243798a = new vpw0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        zpw0 zpw0Var = (zpw0) obj;
        tpw0 tpw0Var = (tpw0) obj2;
        if (tpw0Var.equals(hpw0.f93851a)) {
            return Next.m15605a(Collections.singleton(new xow0(false)));
        }
        if (tpw0Var instanceof qpw0) {
            return Next.m15607i(new zpw0(zpw0Var.f285244a, false), Collections.singleton(zow0.f284879a));
        }
        if (tpw0Var.equals(rpw0.f201654a)) {
            return Next.m15605a(Collections.singleton(new xow0(true)));
        }
        if (!(tpw0Var instanceof spw0)) {
            throw new NoWhenBranchMatchedException();
        }
        spw0 spw0Var = (spw0) tpw0Var;
        zpw0 zpw0Var2 = new zpw0(zpw0Var.f285244a, true);
        String str = spw0Var.f212964a;
        String str2 = null;
        if (str != null) {
            if (str.length() == 0) {
                str = null;
            }
            str2 = str;
        }
        return Next.m15607i(zpw0Var2, Collections.singleton(new apw0(str2, spw0Var.f212965b)));
    }
}
