package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import androidx.emoji2.emojipicker.EmojiView;
import com.spotify.concertcampaignview.p047v1.CtaType;
import io.reactivex.rxjava3.core.Observable;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: renamed from: p.e9 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1806e9 implements rzu0, d15, qw4, pmv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57319a;

    /* JADX INFO: renamed from: b */
    public Object f57320b;

    public /* synthetic */ AbstractC1806e9(Object obj, int i) {
        this.f57319a = i;
        this.f57320b = obj;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m38137A0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m38138B0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static final /* synthetic */ epx m38139C0(AbstractC1806e9 abstractC1806e9) {
        return (epx) abstractC1806e9.f57320b;
    }

    /* JADX INFO: renamed from: l1 */
    public static long m38140l1(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public AbstractC1806e9 m38141A1(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        cg11 cg11Var = (cg11) this.f57320b;
        cg11Var.f37515d = (iMin << 24) | (cg11Var.f37515d & 16777215);
        return mo25838k1();
    }

    /* JADX INFO: renamed from: B1 */
    public void m38142B1(boolean z) {
        ((yum0) this.f57320b).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: C1 */
    public abstract void mo38143C1(c791 c791Var);

    /* JADX INFO: renamed from: D1 */
    public abstract void mo38145D1();

    /* JADX INFO: renamed from: E1 */
    public abstract void mo38147E1(AbstractC2205o8 abstractC2205o8);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F0 */
    public void mo38148F0() {
        View emojiView;
        for (int[] iArr : m38170j1()) {
            LinearLayout linearLayout = new LinearLayout(mo38159Y0());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            for (int i : iArr) {
                int i2 = 2;
                AttributeSet attributeSet = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                if (i == 0) {
                    emojiView = new EmojiView(mo38159Y0(), attributeSet, i2, objArr3 == true ? 1 : 0);
                } else {
                    EmojiView emojiView2 = new EmojiView(mo38159Y0(), objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
                    emojiView2.setWillDrawVariantIndicator$emoji2_emojipicker_release(false);
                    emojiView2.setEmoji((CharSequence) mo38171m1().get(i - 1));
                    emojiView2.setOnClickListener(mo38161a1());
                    if (i == 1) {
                        mo38167g1().post(new kep(emojiView2, 17));
                    }
                    emojiView = emojiView2;
                }
                emojiView.setLayoutParams(new ViewGroup.LayoutParams(mo38168h1().getWidth(), mo38168h1().getHeight()));
                linearLayout.addView(emojiView);
            }
            mo38167g1().addView(linearLayout);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public cg11 m38149G0() {
        cg11 cg11Var = (cg11) this.f57320b;
        int[] iArr = cg11Var.f37513b;
        int i = cg11Var.f37517f;
        if (i != 1) {
            int i2 = cg11Var.f37516e;
            iArr[0] = i2;
            int i3 = cg11Var.f37515d;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int i4 = cg11Var.f37515d;
            iArr[0] = i4;
            iArr[1] = i4;
            int i5 = cg11Var.f37516e;
            iArr[2] = i5;
            iArr[3] = i5;
        }
        float[] fArr = cg11Var.f37512a;
        if (i != 1) {
            fArr[0] = Math.max(((1.0f - cg11Var.f37522k) - cg11Var.f37523l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - cg11Var.f37522k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((cg11Var.f37522k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((cg11Var.f37522k + 1.0f) + cg11Var.f37523l) / 2.0f, 1.0f);
            return cg11Var;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(cg11Var.f37522k, 1.0f);
        fArr[2] = Math.min(cg11Var.f37522k + cg11Var.f37523l, 1.0f);
        fArr[3] = 1.0f;
        return cg11Var;
    }

    /* JADX INFO: renamed from: H0 */
    public abstract void mo38150H0(bqz0 bqz0Var);

    /* JADX INFO: renamed from: I0 */
    public abstract void mo38151I0();

    /* JADX INFO: renamed from: J0 */
    public abstract Object mo38152J0(YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity);

    /* JADX INFO: renamed from: K0 */
    public AbstractC1806e9 mo29046K0(TypedArray typedArray) {
        cg11 cg11Var = (cg11) this.f57320b;
        if (typedArray.hasValue(3)) {
            cg11Var.f37525n = typedArray.getBoolean(3, cg11Var.f37525n);
        }
        if (typedArray.hasValue(0)) {
            cg11Var.f37526o = typedArray.getBoolean(0, cg11Var.f37526o);
        }
        if (typedArray.hasValue(1)) {
            m38184x1(typedArray.getFloat(1, 0.3f));
        }
        if (typedArray.hasValue(11)) {
            m38141A1(typedArray.getFloat(11, 1.0f));
        }
        if (typedArray.hasValue(7)) {
            m38186z1(typedArray.getInt(7, (int) cg11Var.f37530s));
        }
        if (typedArray.hasValue(14)) {
            cg11Var.f37528q = typedArray.getInt(14, cg11Var.f37528q);
        }
        if (typedArray.hasValue(15)) {
            long j = typedArray.getInt(15, (int) cg11Var.f37531t);
            if (j < 0) {
                throw new IllegalArgumentException(edb.m38561j(j, "Given a negative repeat delay: "));
            }
            cg11Var.f37531t = j;
        }
        if (typedArray.hasValue(16)) {
            cg11Var.f37529r = typedArray.getInt(16, cg11Var.f37529r);
        }
        if (typedArray.hasValue(5)) {
            int i = typedArray.getInt(5, cg11Var.f37514c);
            if (i == 1) {
                cg11Var.f37514c = 1;
            } else if (i == 2) {
                cg11Var.f37514c = 2;
            } else if (i != 3) {
                cg11Var.f37514c = 0;
            } else {
                cg11Var.f37514c = 3;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, cg11Var.f37517f) != 1) {
                cg11Var.f37517f = 0;
            } else {
                cg11Var.f37517f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            float f = typedArray.getFloat(6, cg11Var.f37523l);
            if (f < 0.0f) {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f);
            }
            cg11Var.f37523l = f;
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, cg11Var.f37518g);
            if (dimensionPixelSize < 0) {
                throw new IllegalArgumentException(s571.m77246e(dimensionPixelSize, "Given invalid width: "));
            }
            cg11Var.f37518g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, cg11Var.f37519h);
            if (dimensionPixelSize2 < 0) {
                throw new IllegalArgumentException(s571.m77246e(dimensionPixelSize2, "Given invalid height: "));
            }
            cg11Var.f37519h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            float f2 = typedArray.getFloat(13, cg11Var.f37522k);
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Given invalid intensity value: " + f2);
            }
            cg11Var.f37522k = f2;
        }
        if (typedArray.hasValue(19)) {
            float f3 = typedArray.getFloat(19, cg11Var.f37520i);
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Given invalid width ratio: " + f3);
            }
            cg11Var.f37520i = f3;
        }
        if (typedArray.hasValue(10)) {
            float f4 = typedArray.getFloat(10, cg11Var.f37521j);
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Given invalid height ratio: " + f4);
            }
            cg11Var.f37521j = f4;
        }
        if (typedArray.hasValue(18)) {
            cg11Var.f37524m = typedArray.getFloat(18, cg11Var.f37524m);
        }
        return mo25838k1();
    }

    /* JADX INFO: renamed from: L0 */
    public abstract Object mo38153L0(Object obj);

    /* JADX INFO: renamed from: M0 */
    public abstract Typeface mo26666M0(Context context, xzz xzzVar, Resources resources, int i);

    /* JADX INFO: renamed from: N0 */
    public abstract Typeface mo26667N0(Context context, o000[] o000VarArr, int i);

    /* JADX INFO: renamed from: O0 */
    public Typeface mo33552O0(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: P0 */
    public Typeface mo33553P0(Context context, InputStream inputStream) {
        File fileM71818E = q0f1.m71818E(context);
        if (fileM71818E == null) {
            return null;
        }
        try {
            if (q0f1.m71843u(fileM71818E, inputStream)) {
                return Typeface.createFromFile(fileM71818E.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM71818E.delete();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public Typeface mo26668Q0(Context context, Resources resources, int i, String str, int i2) {
        File fileM71818E = q0f1.m71818E(context);
        if (fileM71818E == null) {
            return null;
        }
        try {
            if (q0f1.m71842q(fileM71818E, resources, i)) {
                return Typeface.createFromFile(fileM71818E.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM71818E.delete();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public abstract Object mo38154R0(AbstractC2205o8 abstractC2205o8);

    /* JADX INFO: renamed from: S0 */
    public Typeface mo26669S0(Context context, Typeface typeface, int i, boolean z) {
        Typeface typefaceM86122a;
        try {
            typefaceM86122a = vpd1.m86122a(this, context, typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceM86122a = null;
        }
        return typefaceM86122a == null ? typeface : typefaceM86122a;
    }

    /* JADX INFO: renamed from: T0 */
    public abstract void mo38155T0();

    /* JADX INFO: renamed from: U0 */
    public o000 mo33554U0(o000[] o000VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : CtaType.SEE_ALL_SHOWS_FIELD_NUMBER;
        boolean z = (i & 2) != 0;
        o000 o000Var = null;
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        for (o000 o000Var2 : o000VarArr) {
            int iAbs = (Math.abs(o000Var2.f160199c - i2) * 2) + (o000Var2.f160200d == z ? 0 : 1);
            if (o000Var == null || i3 > iAbs) {
                o000Var = o000Var2;
                i3 = iAbs;
            }
        }
        return o000Var;
    }

    /* JADX INFO: renamed from: V0 */
    public Object m38156V0(Object obj) {
        synchronized (((HashMap) this.f57320b)) {
            try {
                if (((HashMap) this.f57320b).containsKey(obj)) {
                    return ((HashMap) this.f57320b).get(obj);
                }
                Object objMo38153L0 = mo38153L0(obj);
                ((HashMap) this.f57320b).put(obj, objMo38153L0);
                return objMo38153L0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public abstract mv70 mo38157W0(long j, int i, int i2, int i3);

    /* JADX INFO: renamed from: X0 */
    public Integer mo38158X0(ArrayList arrayList, i4b i4bVar) {
        Object next;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            r300 r300Var = (r300) i4bVar.f98475d.invoke(Integer.valueOf(((Number) ((pqm0) obj).f180350a).intValue()));
            if (i4bVar.f98473b || (i4bVar.f98474c.contains(r300Var) && r300Var.f195382k >= i4bVar.f98472a.f195382k)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            List list = (List) x0h1.m89581x(dau.f47107a, new m4b(this, arrayList2, i4bVar, (fbk) null));
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int i = ((r300) ((pqm0) next).f180351b).f195382k;
                        do {
                            Object next2 = it.next();
                            int i2 = ((r300) ((pqm0) next2).f180351b).f195382k;
                            if (i < i2) {
                                next = next2;
                                i = i2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                pqm0 pqm0Var = (pqm0) next;
                if (pqm0Var != null) {
                    return (Integer) pqm0Var.f180350a;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Y0 */
    public abstract Context mo38159Y0();

    /* JADX INFO: renamed from: Z0 */
    public abstract Object mo38160Z0();

    /* JADX INFO: renamed from: a1 */
    public abstract View.OnClickListener mo38161a1();

    /* JADX INFO: renamed from: b1 */
    public Object m38162b1() {
        return this.f57320b;
    }

    /* JADX INFO: renamed from: c1 */
    public abstract int mo38163c1();

    /* JADX INFO: renamed from: d1 */
    public abstract int mo38164d1();

    /* JADX INFO: renamed from: e1 */
    public jx31 m38165e1() {
        return (jx31) this.f57320b;
    }

    /* JADX INFO: renamed from: f1 */
    public List m38166f1(lv70 lv70Var, int i, long j) {
        toi0 toi0Var = (toi0) this.f57320b;
        List list = (List) toi0Var.m87103b(i);
        if (list != null) {
            return list;
        }
        List listM60070a = lv70Var.m60070a(i);
        int size = listM60070a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((h6d0) listM60070a.get(i2)).mo39619B(j));
        }
        toi0Var.m81201i(i, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: g1 */
    public abstract LinearLayout mo38167g1();

    @Override // p204p.d15
    public l25 getAnnotations() {
        l25 l25Var = (l25) this.f57320b;
        if (l25Var != null) {
            return l25Var;
        }
        m38138B0(1);
        throw null;
    }

    @Override // p204p.rzu0
    public gd70 getType() {
        gd70 gd70Var = (gd70) this.f57320b;
        if (gd70Var != null) {
            return gd70Var;
        }
        m38137A0(1);
        throw null;
    }

    /* JADX INFO: renamed from: h1 */
    public abstract View mo38168h1();

    /* JADX INFO: renamed from: i1 */
    public abstract Object mo38169i1();

    /* JADX INFO: renamed from: j1 */
    public int[][] m38170j1() {
        int[][] iArr = (int[][]) this.f57320b;
        if (iArr != null) {
            return iArr;
        }
        wj50.m88260d0("template");
        throw null;
    }

    /* JADX INFO: renamed from: k1 */
    public abstract AbstractC1806e9 mo25838k1();

    /* JADX INFO: renamed from: m1 */
    public abstract List mo38171m1();

    /* JADX INFO: renamed from: n1 */
    public boolean m38172n1() {
        return ((Boolean) ((yum0) this.f57320b).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o1 */
    public abstract Object mo38173o1(nad0 nad0Var, kga kgaVar);

    /* JADX INFO: renamed from: p1 */
    public boolean m38174p1() {
        int i;
        jx31 jx31Var = (jx31) this.f57320b;
        View view = jx31Var.f116782c.f98706h1;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(s571.m77246e(visibility, "Unknown visibility "));
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = jx31Var.f116780a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: q1 */
    public Observable m38175q1(String str, String str2) {
        tre1 tre1Var = (tre1) this.f57320b;
        moe1 moe1VarM98162r = YourLibraryDecorateRequest.m98162r();
        moe1VarM98162r.m62397q(str);
        if (str2.length() == 0) {
            str2 = " ";
        }
        moe1VarM98162r.m62398r(mo38180u1(str2));
        Observable map = tre1Var.m81348c((YourLibraryDecorateRequest) moe1VarM98162r.build()).map(g2h1.f75961t).map(new kp7(this, 2));
        wj50.m88279p(map);
        return map;
    }

    /* JADX INFO: renamed from: r1 */
    public abstract mmv mo38176r1(ktx ktxVar);

    /* JADX WARN: Type inference failed for: r0v1, types: [p.gh00, p.ri00] */
    /* JADX INFO: renamed from: s1 */
    public Object m38177s1() {
        return ((ri00) this.f57320b).invoke(UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: t1 */
    public abstract AbstractC2205o8 mo38178t1(fva fvaVar);

    public String toString() {
        switch (this.f57319a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f57320b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p204p.qw4
    /* JADX INFO: renamed from: u0 */
    public List mo38179u0() {
        return (List) this.f57320b;
    }

    /* JADX INFO: renamed from: u1 */
    public YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs mo38180u1(String str) {
        return YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.m98234w();
    }

    /* JADX INFO: renamed from: v1 */
    public abstract gh00 mo38181v1(bqz0 bqz0Var);

    /* JADX INFO: renamed from: w1 */
    public abstract void mo38182w1(omc omcVar);

    @Override // p204p.qw4
    /* JADX INFO: renamed from: x0 */
    public boolean mo38183x0() {
        List list = (List) this.f57320b;
        return list.isEmpty() || (list.size() == 1 && ((wz60) list.get(0)).m89400c());
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC1806e9 m38184x1(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        cg11 cg11Var = (cg11) this.f57320b;
        cg11Var.f37516e = (iMin << 24) | (cg11Var.f37516e & 16777215);
        return mo25838k1();
    }

    /* JADX INFO: renamed from: y1 */
    public abstract void mo38185y1(Object obj);

    /* JADX INFO: renamed from: z1 */
    public AbstractC1806e9 m38186z1(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "Given a negative duration: "));
        }
        ((cg11) this.f57320b).f37530s = j;
        return mo25838k1();
    }

    public AbstractC1806e9(Resources resources) {
        this.f57319a = 15;
        resources.getClass();
        this.f57320b = new WeakReference(resources);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1806e9(gh00 gh00Var) {
        this.f57319a = 13;
        this.f57320b = (ri00) gh00Var;
    }

    public AbstractC1806e9(l25 l25Var) {
        this.f57319a = 1;
        if (l25Var != null) {
            this.f57320b = l25Var;
        } else {
            m38138B0(0);
            throw null;
        }
    }

    public AbstractC1806e9(gd70 gd70Var) {
        this.f57319a = 0;
        if (gd70Var != null) {
            this.f57320b = gd70Var;
        } else {
            m38137A0(0);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1806e9(th00 th00Var) {
        this.f57319a = 9;
        this.f57320b = (qe70) th00Var;
    }

    public AbstractC1806e9(int i) {
        this.f57319a = i;
        switch (i) {
            case 11:
                this.f57320b = new HashMap();
                break;
            case 12:
                toi0 toi0Var = x350.f257695a;
                this.f57320b = new toi0();
                break;
            case 16:
                this.f57320b = new cg11();
                break;
            case 18:
                this.f57320b = new Object();
                break;
            case 20:
                this.f57320b = sam.m77645B(Boolean.FALSE);
                break;
            case 21:
                this.f57320b = new ConcurrentHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void mo38144D0() {
    }

    /* JADX INFO: renamed from: E0 */
    public void mo38146E0() {
    }
}
