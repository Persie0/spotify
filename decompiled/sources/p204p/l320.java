package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class l320 implements w1k {

    /* JADX INFO: renamed from: a */
    public final Context f129183a;

    /* JADX INFO: renamed from: b */
    public final e3p f129184b;

    /* JADX INFO: renamed from: c */
    public final dsw0 f129185c;

    /* JADX INFO: renamed from: d */
    public final ynb f129186d;

    /* JADX INFO: renamed from: e */
    public final in9 f129187e;

    /* JADX INFO: renamed from: f */
    public final oa81 f129188f;

    /* JADX INFO: renamed from: g */
    public final k1n f129189g;

    /* JADX INFO: renamed from: h */
    public final yps f129190h;

    /* JADX INFO: renamed from: i */
    public final oyz f129191i;

    public l320(Context context, e3p e3pVar, dsw0 dsw0Var, ynb ynbVar, in9 in9Var, oa81 oa81Var, k1n k1nVar, yps ypsVar, oyz oyzVar) {
        this.f129183a = context;
        this.f129184b = e3pVar;
        this.f129185c = dsw0Var;
        this.f129186d = ynbVar;
        this.f129187e = in9Var;
        this.f129188f = oa81Var;
        this.f129189g = k1nVar;
        this.f129190h = ypsVar;
        this.f129191i = oyzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.w1k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object mo32553a(o320 o320Var, ibk ibkVar) {
        j320 j320Var;
        String str;
        String str2;
        String str3;
        nmn0 nmn0Var;
        if (ibkVar instanceof j320) {
            j320Var = (j320) ibkVar;
            int i = j320Var.f108272g;
            if ((i & Integer.MIN_VALUE) != 0) {
                j320Var.f108272g = i - Integer.MIN_VALUE;
            } else {
                j320Var = new j320(this, ibkVar);
            }
        } else {
            j320Var = new j320(this, ibkVar);
        }
        Object obj = j320Var.f108270e;
        int i2 = j320Var.f108272g;
        if (i2 == 0) {
            bga.m29073P(obj);
            String str4 = o320Var.f161236a;
            String str5 = o320Var.f161237b;
            nmn0 nmn0Var2 = o320Var.f161238c;
            str = o320Var.f161239d;
            j320Var.f108266a = str4;
            j320Var.f108267b = str5;
            j320Var.f108268c = nmn0Var2;
            j320Var.f108269d = str;
            j320Var.f108272g = 1;
            Object objM57982c = m57982c(nmn0Var2, str4, j320Var);
            Object obj2 = yuk.f276404a;
            if (objM57982c == obj2) {
                return obj2;
            }
            str2 = str4;
            obj = objM57982c;
            str3 = str5;
            nmn0Var = nmn0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = j320Var.f108269d;
            nmn0Var = j320Var.f108268c;
            str3 = j320Var.f108267b;
            str2 = j320Var.f108266a;
            bga.m29073P(obj);
        }
        i320 i320Var = (i320) obj;
        f4k f4kVar = new f4k(this.f129183a.getString(R.string.menu_title_group_details_more), null, 0 == true ? 1 : 0, 6);
        ro80 ro80VarM44508o = geg1.m44508o();
        if (i320Var instanceof h320) {
            if (((h320) i320Var).f87117a) {
                ro80VarM44508o.add(this.f129188f.m66526b(str2));
            } else {
                ro80VarM44508o.add(this.f129187e.m51122a(str2));
            }
        } else if (!wj50.m88271j(i320Var, g320.f76078a)) {
            throw new NoWhenBranchMatchedException();
        }
        ynb ynbVar = this.f129186d;
        l44 l44Var = ynbVar.f274426a;
        if (l44Var.m58075h() && l44Var.m58100x()) {
            ro80VarM44508o.add(this.f129185c.m36786c(mjd.m61968d(6, str2, null), new voc1(str3), Collections.singletonMap("chatFlag", "true")));
        }
        boolean zM58077i = ynbVar.f274426a.m58077i();
        yps ypsVar = this.f129190h;
        if (zM58077i) {
            if (!nmn0Var.m65145g() && !nmn0Var.m65146h()) {
                ro80VarM44508o.add(ypsVar.m94313c(str2, str3, str));
            }
            ro80VarM44508o.add(this.f129189g.m55116a(new cnq(nmn0Var), str2, str3));
            if (!nmn0Var.m65145g() && !nmn0Var.m65146h()) {
                ro80VarM44508o.add(new f5k("campfire_leave_and_delete_group_chat", (wwu) bpu.f29605c, (c5k) null, Integer.valueOf(R.string.menu_item_leave_and_delete_group_chat_title), (String) null, false, (p221) null, new e5k(new v4k(3), 3, new d5k(dm70.f50453Z, dm70.f50437L0), new x740(this.f129191i, str2, str3, 10)), 244));
            }
        } else {
            ro80VarM44508o.add(ypsVar.m94313c(str2, str3, str));
        }
        return new g7k(f4kVar, geg1.m44506m(ro80VarM44508o), 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m57982c(nmn0 nmn0Var, String str, ibk ibkVar) {
        k320 k320Var;
        if (ibkVar instanceof k320) {
            k320Var = (k320) ibkVar;
            int i = k320Var.f118752c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k320Var.f118752c = i - Integer.MIN_VALUE;
            } else {
                k320Var = new k320(this, ibkVar);
            }
        } else {
            k320Var = new k320(this, ibkVar);
        }
        Object objM59345v = k320Var.f118750a;
        int i2 = k320Var.f118752c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM59345v);
                if (nmn0Var.m65145g() || nmn0Var.m65146h()) {
                    return g320.f76078a;
                }
                e3p e3pVar = this.f129184b;
                k320Var.f118752c = 1;
                objM59345v = e3pVar.f55841b.m59345v(str, k320Var);
                yuk yukVar = yuk.f276404a;
                if (objM59345v == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM59345v);
            }
            return new h320(((Boolean) objM59345v).booleanValue());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new h320(false);
        }
    }
}
