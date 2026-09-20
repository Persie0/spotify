package p204p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class t5m0 implements Function, yns {
    /* JADX INFO: renamed from: f */
    public static n3e1 m80116f(Map map) {
        int iM71232q;
        String str = (String) map.get("workout.type");
        if (str == null || (iM71232q = pwb.m71232q(str)) == 0) {
            return null;
        }
        String str2 = (String) map.get("workout.cue.voice");
        if (str2 == null) {
            str2 = "voice2";
        }
        String str3 = (String) map.get("workout.cue.provider");
        if (str3 == null) {
            str3 = "sonantic_large";
        }
        return new n3e1(iM71232q, str2, str3);
    }

    /* JADX INFO: renamed from: g */
    public static tae1 m80117g(Map map) {
        String str;
        String str2 = (String) map.get("workout.segment.id");
        z3e1 z3e1Var = (str2 == null || (str = (String) map.get("workout.segment.name")) == null) ? null : new z3e1(str2, str, (String) map.get("workout.segment.subtitle"));
        ro80 ro80VarM44508o = geg1.m44508o();
        for (int i = 0; i < 101; i++) {
            String str3 = (String) map.get("workout.cue." + i + ".ssml");
            if (str3 == null) {
                break;
            }
            String str4 = (String) map.get("workout.cue." + i + ".offset_ms");
            Integer numM29807r0 = str4 != null ? bm51.m29807r0(str4) : null;
            String str5 = (String) map.get("workout.cue." + i + ".type");
            ro80VarM44508o.add(new c3e1(str3, numM29807r0, str5 != null ? ljf1.m59159k(str5) : u0m.f225531a));
        }
        return new tae1(z3e1Var, geg1.m44506m(ro80VarM44508o), (String) map.get("workout.finish_label"));
    }

    @Override // p204p.yns
    /* JADX INFO: renamed from: a */
    public int mo30163a(Context context, String str, boolean z) {
        return aos.m26615d(context, str, z);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ikc0.m50942n(obj);
        throw null;
    }

    @Override // p204p.yns
    /* JADX INFO: renamed from: b */
    public int mo30164b(Context context, String str) {
        return aos.m26613a(context, str);
    }

    /* JADX INFO: renamed from: c */
    public String mo70597c(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* JADX INFO: renamed from: d */
    public Object mo67579d(Class cls, Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo67580e(Method method) {
        return false;
    }
}
