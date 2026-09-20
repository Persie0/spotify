package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class nch1 implements Function, Predicate, fk00 {

    /* JADX INFO: renamed from: c */
    public static final nch1 f152517c;

    /* JADX INFO: renamed from: d */
    public static final nch1 f152518d;

    /* JADX INFO: renamed from: e */
    public static final nch1 f152519e;

    /* JADX INFO: renamed from: f */
    public static final nch1 f152520f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152521a;

    /* JADX INFO: renamed from: b */
    public String f152522b;

    static {
        int i = 0;
        f152517c = new nch1("TINK", i);
        f152518d = new nch1("CRUNCHY", i);
        f152519e = new nch1("LEGACY", i);
        f152520f = new nch1("NO_PREFIX", i);
    }

    public /* synthetic */ nch1(String str, int i) {
        this.f152521a = i;
        this.f152522b = str;
    }

    /* JADX INFO: renamed from: a */
    public e08 m64161a() {
        String str = this.f152522b;
        if (str != null) {
            return new e08(str);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        List list;
        switch (this.f152521a) {
            case 3:
                return new pqm0(this.f152522b, (f6s) obj);
            case 4:
            case 8:
            default:
                return ((gqx) obj).mo45449a(bob1.class, this.f152522b);
            case 5:
                d0w d0wVar = (d0w) ((Map) obj).get(this.f152522b);
                return Boolean.valueOf(d0wVar != null ? d0wVar.f44081m : false);
            case 6:
                String str = this.f152522b;
                return ((Boolean) obj).booleanValue() ? edb.m38564m("spotify:list:popular-release-segments-main-roles:artist_", str) : edb.m38564m("spotify:list:offline-playable-artist:", str);
            case 7:
                y5f y5fVar = (y5f) ((Map) obj).get(this.f152522b);
                return Boolean.valueOf(y5fVar != null ? y5fVar.f269417a : false);
            case 9:
                Boolean bool = (Boolean) ((Map) obj).get(this.f152522b);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 10:
                qu80 qu80Var = (qu80) ((p2x0) obj).m68970c();
                if (qu80Var == null || (list = qu80Var.f192598d) == null) {
                    return lau.f131415a;
                }
                ArrayList<nw80> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    nw80 nw80Var = (nw80) obj2;
                    if (nw80Var.f159051e) {
                        Set set = dd41.f47702f;
                        if (r46.m74726U(nw80Var.f159049c).f47709c == gn80.TRACK) {
                            arrayList.add(obj2);
                        }
                    }
                }
                String str2 = this.f152522b;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                for (nw80 nw80Var2 : arrayList) {
                    String str3 = nw80Var2.f159049c;
                    String str4 = nw80Var2.f159047a;
                    String str5 = nw80Var2.f159055i;
                    j7f0 j7f0Var = nw80Var2.f159061o;
                    String strM43753y0 = j7f0Var instanceof ib81 ? g6f.m43753y0(((ib81) j7f0Var).f100472b, ", ", null, null, o131.f160599Z, 30) : "";
                    String strM65752c = nw80Var2.m65752c();
                    arrayList2.add(new nb81(str3, str4, str5, strM43753y0, nw80Var2.m65750a(1), str2, strM65752c == null ? "" : strM65752c));
                }
                return arrayList2;
            case 11:
                Logger.m3967c((Throwable) obj, edb.m38564m("Error loading stories for feature ", this.f152522b), new Object[0]);
                return ha51.f89127a;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m64162b(String str) {
        if (str == null) {
            throw new NullPointerException("Null content");
        }
        this.f152522b = str;
    }

    @Override // p204p.fk00
    public void onFailure(Throwable th) {
        yif1.m93821x0("custom command " + this.f152522b + " produced an error: " + th.getMessage(), th);
    }

    @Override // p204p.fk00
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return wj50.m88271j(((ezk) obj).f64407b, this.f152522b);
    }

    public String toString() {
        switch (this.f152521a) {
            case 0:
                return this.f152522b;
            default:
                return super.toString();
        }
    }

    public nch1(r331 r331Var, String str) {
        this.f152521a = 10;
        this.f152522b = str;
    }

    public nch1(Context context) {
        this.f152521a = 1;
        this.f152522b = context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    public nch1() {
        this.f152521a = 2;
    }
}
