package p204p;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class clv0 {

    /* JADX INFO: renamed from: a */
    public final da80 f39404a;

    /* JADX INFO: renamed from: b */
    public final m690 f39405b;

    /* JADX INFO: renamed from: c */
    public final it9 f39406c;

    /* JADX INFO: renamed from: d */
    public final d97 f39407d;

    /* JADX INFO: renamed from: e */
    public final stp0 f39408e;

    /* JADX INFO: renamed from: f */
    public final ma80 f39409f;

    /* JADX INFO: renamed from: g */
    public final id4 f39410g;

    /* JADX INFO: renamed from: h */
    public final luk f39411h;

    /* JADX INFO: renamed from: i */
    public final fiz f39412i;

    /* JADX INFO: renamed from: j */
    public final yab f39413j;

    /* JADX INFO: renamed from: k */
    public final wt80 f39414k;

    public clv0(da80 da80Var, m690 m690Var, it9 it9Var, d97 d97Var, stp0 stp0Var, ma80 ma80Var, id4 id4Var, luk lukVar, fiz fizVar, yab yabVar, wt80 wt80Var) {
        this.f39404a = da80Var;
        this.f39405b = m690Var;
        this.f39406c = it9Var;
        this.f39407d = d97Var;
        this.f39408e = stp0Var;
        this.f39409f = ma80Var;
        this.f39410g = id4Var;
        this.f39411h = lukVar;
        this.f39412i = fizVar;
        this.f39413j = yabVar;
        this.f39414k = wt80Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        if (r2 == r9) goto L51;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m33344a(utm0 utm0Var, ibk ibkVar) {
        zkv0 zkv0Var;
        String str;
        int i;
        String str2;
        String str3;
        int i2;
        int i3;
        if (ibkVar instanceof zkv0) {
            zkv0Var = (zkv0) ibkVar;
            int i4 = zkv0Var.f283854g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zkv0Var.f283854g = i4 - Integer.MIN_VALUE;
            } else {
                zkv0Var = new zkv0(this, ibkVar);
            }
        } else {
            zkv0Var = new zkv0(this, ibkVar);
        }
        zkv0 zkv0Var2 = zkv0Var;
        Object objM60976e = zkv0Var2.f283852e;
        int i5 = zkv0Var2.f283854g;
        Object obj = yuk.f276404a;
        m690 m690Var = this.f39405b;
        fbk fbkVar = null;
        try {
            if (i5 == 0) {
                bga.m29073P(objM60976e);
                String str4 = utm0Var.f233945a.f225423b;
                zkv0Var2.f283848a = str4;
                zkv0Var2.f283850c = 0;
                zkv0Var2.f283854g = 1;
                Object objM33345b = m33345b(utm0Var, zkv0Var2);
                if (objM33345b != obj) {
                    str = str4;
                    objM60976e = objM33345b;
                    i = 0;
                }
                return obj;
            }
            if (i5 == 1) {
                i = zkv0Var2.f283850c;
                str = zkv0Var2.f283848a;
                bga.m29073P(objM60976e);
            } else if (i5 == 2) {
                int i6 = zkv0Var2.f283851d;
                int i7 = zkv0Var2.f283850c;
                str2 = zkv0Var2.f283849b;
                String str5 = zkv0Var2.f283848a;
                bga.m29073P(objM60976e);
                i2 = i7;
                i3 = i6;
                str3 = str5;
                i690 i690Var = i690.f99147Q0;
                js3 js3Var = new js3(this, str3, str2, fbkVar, 19);
                zkv0Var2.f283848a = null;
                zkv0Var2.f283849b = null;
                zkv0Var2.f283850c = i2;
                zkv0Var2.f283851d = i3;
                zkv0Var2.f283854g = 3;
                objM60976e = m690Var.m60976e(i690Var, js3Var, zkv0Var2);
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM60976e);
            }
            return (y6x0) objM60976e;
            String str6 = ((tkv0) objM60976e).f221228a;
            if (str6 == null || str6.length() == 0) {
                m690Var.m60973b(4);
                return new f6x0(str);
            }
            this.f39408e.f213944a = str6;
            zkv0Var2.f283848a = str;
            zkv0Var2.f283849b = str6;
            zkv0Var2.f283850c = i;
            zkv0Var2.f283851d = 0;
            zkv0Var2.f283854g = 2;
            da80 da80Var = this.f39404a;
            Intent intent = ((u090) da80Var.f46997c).f225422a;
            wb21 wb21Var = new wb21(str6, intent);
            xbq0 xbq0Var = new xbq0();
            ybq0 ybq0Var = new ybq0(str6, intent);
            List list = (List) da80Var.f46999e;
            ArrayList<rwp0> arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rwp0 rwp0VarM86669a = ((vxp0) it.next()).m86669a(wb21Var);
                if (rwp0VarM86669a != null) {
                    arrayList.add(rwp0VarM86669a);
                }
            }
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            for (rwp0 rwp0Var : arrayList) {
                arrayList2.add(new j690(rwp0Var.mo30693a(), new js3(rwp0Var, ybq0Var, xbq0Var, fbkVar, 16)));
                i = i;
            }
            int i8 = i;
            Object objM60977f = ((m690) da80Var.f46996b).m60977f(i690.f99160a, kk40.m56661c((luk) da80Var.f46998d), arrayList2, zkv0Var2);
            if (objM60977f != obj) {
                objM60977f = w2a1.f247311a;
            }
            if (objM60977f != obj) {
                String str7 = str;
                str2 = str6;
                str3 = str7;
                i2 = i8;
                i3 = 0;
                i690 i690Var2 = i690.f99147Q0;
                js3 js3Var2 = new js3(this, str3, str2, fbkVar, 19);
                zkv0Var2.f283848a = null;
                zkv0Var2.f283849b = null;
                zkv0Var2.f283850c = i2;
                zkv0Var2.f283851d = i3;
                zkv0Var2.f283854g = 3;
                objM60976e = m690Var.m60976e(i690Var2, js3Var2, zkv0Var2);
            }
            return obj;
        } catch (TimeoutCancellationException e) {
            m690Var.m60973b(5);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m33345b(utm0 utm0Var, ibk ibkVar) {
        alv0 alv0Var;
        Object c6x0Var;
        if (ibkVar instanceof alv0) {
            alv0Var = (alv0) ibkVar;
            int i = alv0Var.f16997d;
            if ((i & Integer.MIN_VALUE) != 0) {
                alv0Var.f16997d = i - Integer.MIN_VALUE;
            } else {
                alv0Var = new alv0(this, ibkVar);
            }
        } else {
            alv0Var = new alv0(this, ibkVar);
        }
        Object objM76978s = alv0Var.f16995b;
        int i2 = alv0Var.f16997d;
        int i3 = 0;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76978s);
                Set set = dd41.f47702f;
                if (!r46.m74712E(utm0Var.f233945a.f225423b, lup0.f137127e, aup0.f19998f)) {
                    return new tkv0(utm0Var.f233945a.f225423b);
                }
                blv0 blv0Var = new blv0(this, utm0Var, fbkVar, i3);
                alv0Var.f16994a = utm0Var;
                alv0Var.f16997d = 1;
                objM76978s = s1h1.m76978s(30000L, blv0Var, alv0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76978s == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                utm0Var = alv0Var.f16994a;
                bga.m29073P(objM76978s);
            }
            c6x0Var = (tkv0) objM76978s;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, s571.m77251j("Failed to lookup Personal Playlist Lookup URI ", utm0Var.f233945a.f225423b, "."), new Object[0]);
        }
        tkv0 tkv0Var = new tkv0(null);
        if (c6x0Var instanceof c6x0) {
            c6x0Var = tkv0Var;
        }
        return (tkv0) c6x0Var;
    }
}
