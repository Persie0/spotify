package p204p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zfg1 {

    /* JADX INFO: renamed from: a */
    public static final p4b1 f282313a = new p4b1(4);

    /* JADX INFO: renamed from: b */
    public static final p4b1 f282314b = new p4b1(5);

    /* JADX INFO: renamed from: c */
    public static final p4b1 f282315c = new p4b1(6);

    /* JADX INFO: renamed from: d */
    public static final p4b1 f282316d = new p4b1(7);

    /* JADX INFO: renamed from: e */
    public static final p4b1 f282317e = new p4b1(8);

    /* JADX INFO: renamed from: f */
    public static final p4b1 f282318f = new p4b1(9);

    /* JADX INFO: renamed from: g */
    public static final p4b1 f282319g = new p4b1(10);

    /* JADX INFO: renamed from: h */
    public static sd40 f282320h;

    /* JADX INFO: renamed from: i */
    public static sd40 f282321i;

    /* JADX INFO: renamed from: a */
    public static final eez m96012a(long j) {
        return new eez(j);
    }

    /* JADX INFO: renamed from: b */
    public static final void m96013b(String str, boolean z, String str2, eh00 eh00Var, fxh0 fxh0Var, String str3, xq00 xq00Var, int i, int i2) {
        String str4;
        int i3;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-768139945);
        int i4 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= xq00Var.m91766g(str2) ? 256 : 128;
        }
        int i5 = i4 | (xq00Var.m91770i(eh00Var) ? 2048 : 1024);
        int i6 = i5 | 24576;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 = i5 | 221184;
            str4 = str3;
        } else {
            str4 = str3;
            i3 = i6 | (xq00Var.m91766g(str4) ? 131072 : 65536);
        }
        if (xq00Var.m91752Y(i3 & 1, (74899 & i3) != 74898)) {
            fyf fyfVarM75772x = null;
            if (i7 != 0) {
                str4 = null;
            }
            kyu kyuVar = new kyu(null, 0, null, null, 30);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean z2 = (i3 & 7168) == 2048;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new nf10(23, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            peu peuVar = new peu(u40.f226523c, (eh00) objM91750T);
            if (str4 == null) {
                xq00Var.m91771i0(-70918839);
            } else {
                xq00Var.m91771i0(-70918838);
                fyfVarM75772x = rkk.m75772x(1952145066, new tv20(str4, 1), xq00Var);
            }
            xq00Var.m91788r(false);
            p711.m69222a(fxh0VarM61822f, kyuVar, z ? sdu.f208086a : new qdu(str2), false, null, null, peuVar, null, rmg.f200533b, null, null, fyfVarM75772x, null, null, null, rkk.m75772x(1059323283, new tv20(str, 2), xq00Var), xq00Var, 100663360, 196608, 30392);
            fxh0Var2 = cxh0Var;
            str4 = str4;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gz4(str, z, str2, eh00Var, fxh0Var2, str4, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final rvc m96014c(rvc rvcVar) {
        if (!(rvcVar.f203050b instanceof qxd) || rvcVar.f203053e.size() >= 2) {
            return rvcVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final q700 m96015d(i500 i500Var, i500 i500Var2, l5j0 l5j0Var, int i) {
        k5j0 k5j0VarMo58245h;
        h600 h600VarMo49777a;
        k5j0 k5j0VarMo58245h2;
        if (i500Var2 == i500Var && i > 0) {
            return q700.f185974c;
        }
        if (i500Var2 == i500Var) {
            return q700.f185972a;
        }
        if (((l5j0Var == null || (k5j0VarMo58245h2 = l5j0Var.mo58245h()) == null) ? null : k5j0VarMo58245h2.mo49778e()) == i500Var2) {
            if (((l5j0Var == null || (k5j0VarMo58245h = l5j0Var.mo58245h()) == null || (h600VarMo49777a = k5j0VarMo58245h.mo49777a()) == null) ? null : h600VarMo49777a.f87943d) instanceof yzq0) {
                k5j0 k5j0VarMo58250m = l5j0Var.mo58250m();
                if ((k5j0VarMo58250m != null ? k5j0VarMo58250m.mo49778e() : null) == i500Var) {
                    return q700.f185973b;
                }
            }
        }
        return q700.f185975d;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m96016e(ArrayList arrayList, List list) {
        return arrayList.containsAll(list) && list.containsAll(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public static final glb[] m96017f(nkb nkbVar) {
        if (nkbVar instanceof mkb) {
            wdj wdjVar = (wdj) ((mkb) nkbVar).f144544a.f176152f;
            return new glb[]{new flb(wdjVar.f250292a, wdjVar.f250294c, wdjVar.f250298g)};
        }
        if (nkbVar instanceof ikb) {
            return new glb[]{new dlb(((jdj) ((ikb) nkbVar).f103081a.f176152f).f111359a, null)};
        }
        if (nkbVar instanceof kkb) {
            kkb kkbVar = (kkb) nkbVar;
            wdj wdjVar2 = (wdj) kkbVar.f123554b.f176152f;
            return new glb[]{new flb(wdjVar2.f250292a, wdjVar2.f250294c, wdjVar2.f250298g), new dlb(((jdj) kkbVar.f123553a.f176152f).f111359a, null)};
        }
        if (nkbVar instanceof jkb) {
            jkb jkbVar = (jkb) nkbVar;
            return new glb[]{new elb((pdj) jkbVar.f113259b.f176152f), new dlb(((jdj) jkbVar.f113258a.f176152f).f111359a, null)};
        }
        if (nkbVar instanceof lkb) {
            return new glb[]{new elb((pdj) ((lkb) nkbVar).f134308a.f176152f)};
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public static final mlb m96018g(vdj vdjVar) {
        if (vdjVar instanceof qdj) {
            qdj qdjVar = (qdj) vdjVar;
            return new hlb(qdjVar.f187698a, qdjVar.f187699b);
        }
        if (vdjVar instanceof sdj) {
            sdj sdjVar = (sdj) vdjVar;
            return new jlb(sdjVar.f208018a, sdjVar.f208019b, sdjVar.f208020c);
        }
        if (vdjVar instanceof udj) {
            udj udjVar = (udj) vdjVar;
            return new llb(udjVar.f229257a, udjVar.f229258b);
        }
        if (vdjVar instanceof tdj) {
            return new klb(((tdj) vdjVar).f219312a);
        }
        if (vdjVar instanceof rdj) {
            return new ilb(((rdj) vdjVar).f198154a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    public static final ComposeView m96019h(Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setViewCompositionStrategy(mkr0.f144646T0);
        return composeView;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m96020i(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: j */
    public static final uyi0 m96021j(View view) {
        uyi0 uyi0Var = (uyi0) btz0.m30482F(btz0.m30491O(pni0.f179402Y0, btz0.m30487K(view, pni0.f179400X0)));
        if (uyi0Var != null) {
            return uyi0Var;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: k */
    public static final String m96022k(Context context, br50 br50Var) {
        if (br50Var instanceof qq50) {
            return klh.m56834f(context.getString(R.string.assisted_curation_search_show), " • ", ((qq50) br50Var).f191494d);
        }
        if (br50Var instanceof cq50) {
            return klh.m56834f(context.getString(R.string.assisted_curation_search_album), " • ", g6f.m43753y0(((cq50) br50Var).f40743h, ", ", null, null, null, 62));
        }
        if (br50Var instanceof lq50) {
            String string = context.getString(R.string.assisted_curation_search_playlist);
            wj50.m88279p(string);
            return string;
        }
        if (br50Var instanceof tq50) {
            return klh.m56834f(context.getString(R.string.assisted_curation_search_song), " • ", g6f.m43753y0(((tq50) br50Var).f222712X, ", ", null, null, go51.f82857U0, 30));
        }
        if (br50Var instanceof dq50) {
            String string2 = context.getString(R.string.assisted_curation_search_artist);
            wj50.m88279p(string2);
            return string2;
        }
        if (br50Var instanceof jq50) {
            return klh.m56834f(context.getString(R.string.assisted_curation_search_episode), " • ", ((jq50) br50Var).f114794d);
        }
        if (br50Var instanceof fq50) {
            return klh.m56834f(context.getString(R.string.assisted_curation_search_audiobook), " • ", g6f.m43753y0(((fq50) br50Var).f72059Y, null, null, null, null, 63));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static final fc0 m96023l(long j, ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            next = it.next();
            fc0 fc0Var = (fc0) next;
            long jM87008m = w1h1.m87008m(fc0Var.f67963b);
            if (j < w1h1.m87008m(fc0Var.f67964c) && jM87008m <= j) {
                return (fc0) next;
            }
        }
        next = null;
        return (fc0) next;
    }

    /* JADX INFO: renamed from: m */
    public static final fxh0 m96024m(fxh0 fxh0Var) {
        return m96028q(fxh0Var, f282319g);
    }

    /* JADX INFO: renamed from: n */
    public static final Next m96025n(cgb0 cgb0Var, yeb0 yeb0Var, d850 d850Var) {
        boolean zContains;
        String str;
        int length;
        znz0 znz0Var;
        auh0 auh0Var = cgb0Var.f37616M0;
        if (auh0Var instanceof uth0) {
            return Next.m15608j();
        }
        fnb0 fnb0Var = cgb0Var.f37627c;
        if (!(fnb0Var instanceof dnb0)) {
            return Next.m15608j();
        }
        s7f s7fVar = ((dnb0) fnb0Var).f50726a;
        Set linkedHashSet = null;
        vth0 vth0Var = auh0Var instanceof vth0 ? (vth0) auh0Var : null;
        if (vth0Var != null && (znz0Var = vth0Var.f244676a) != null) {
            linkedHashSet = znz0Var.f284603a;
        }
        int i = 0;
        if (linkedHashSet != null) {
            Set set = linkedHashSet;
            ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((fk80) it.next()).f70497a));
            }
            zContains = arrayList.contains(Integer.valueOf(yeb0Var.f271957a));
        } else {
            zContains = false;
        }
        if (!zContains) {
            int i2 = yeb0Var.f271957a;
            linkedHashSet = new LinkedHashSet();
            co40 co40VarM43744r1 = g6f.m43744r1(s7fVar.f206350a.f249431a);
            int iM31820L = c95.m31820L(i6f.m49804T(co40VarM43744r1, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            Iterator it2 = co40VarM43744r1.iterator();
            while (true) {
                do40 do40Var = (do40) it2;
                if (!((Iterator) do40Var.f50936c).hasNext()) {
                    break;
                }
                bo40 bo40Var = (bo40) do40Var.next();
                linkedHashMap.put(Integer.valueOf(bo40Var.f29008a), bo40Var.f29009b);
            }
            Iterator it3 = h6f.m46715L(0, -1, 1, -2, 2).iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue() + i2;
                rab0 rab0Var = (rab0) linkedHashMap.get(Integer.valueOf(iIntValue));
                if (rab0Var != null && (str = rab0Var.f197249b) != null && (length = str.length() + i) <= 200) {
                    linkedHashSet.add(new fk80(iIntValue));
                    i = length;
                }
            }
        }
        return !linkedHashSet.isEmpty() ? Next.m15605a(Collections.singleton(new reb0(!cgb0Var.f37623Y, m96027p(s7fVar.f206350a.f249431a, linkedHashSet), cgb0Var.f37625a, s7fVar, d850Var))) : Next.m15608j();
    }

    /* JADX INFO: renamed from: o */
    public static final knm0 m96026o(q700 q700Var) {
        int iOrdinal = q700Var.ordinal();
        if (iOrdinal == 0) {
            return hnm0.f93363a;
        }
        if (iOrdinal == 1) {
            return new jnm0(1);
        }
        if (iOrdinal == 2) {
            return new jnm0(2);
        }
        if (iOrdinal == 3) {
            return new inm0(1);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: p */
    public static final LinkedHashMap m96027p(List list, Set set) {
        co40 co40VarM43744r1 = g6f.m43744r1(list);
        ArrayList<bo40> arrayList = new ArrayList();
        Iterator it = co40VarM43744r1.iterator();
        while (true) {
            do40 do40Var = (do40) it;
            if (!((Iterator) do40Var.f50936c).hasNext()) {
                break;
            }
            Object next = do40Var.next();
            if (set.contains(new fk80(((bo40) next).f29008a))) {
                arrayList.add(next);
            }
        }
        int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (bo40 bo40Var : arrayList) {
            linkedHashMap.put(String.valueOf(bo40Var.f29008a), ((rab0) bo40Var.f29009b).f197249b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: q */
    public static final fxh0 m96028q(fxh0 fxh0Var, gh00 gh00Var) {
        return fxh0Var.mo34315F(new oh61(gh00Var));
    }
}
