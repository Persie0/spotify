package p204p;

import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.style.TextDecoration;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class sk4 implements psm0 {

    /* JADX INFO: renamed from: X */
    public final boolean f210001X;

    /* JADX INFO: renamed from: Y */
    public final int f210002Y;

    /* JADX INFO: renamed from: a */
    public final String f210003a;

    /* JADX INFO: renamed from: b */
    public final if71 f210004b;

    /* JADX INFO: renamed from: c */
    public final List f210005c;

    /* JADX INFO: renamed from: d */
    public final List f210006d;

    /* JADX INFO: renamed from: e */
    public final hzz f210007e;

    /* JADX INFO: renamed from: f */
    public final yqq f210008f;

    /* JADX INFO: renamed from: g */
    public final mr4 f210009g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f210010h;

    /* JADX INFO: renamed from: i */
    public final uo70 f210011i;

    /* JADX INFO: renamed from: t */
    public oa81 f210012t;

    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0170  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public sk4(String str, if71 if71Var, List list, List list2, hzz hzzVar, yqq yqqVar) {
        boolean zBooleanValue;
        u8u u8uVar;
        Object obj;
        ?? arrayList;
        CharSequence charSequence;
        Spannable spannableString;
        ew31 ew31Var;
        vsm0 vsm0Var;
        eeo0 eeo0Var;
        dk80 dk80VarM50283j;
        float f;
        yqq yqqVar2;
        ndo0 ndo0Var;
        CharSequence charSequence2;
        ndo0 ndo0Var2;
        this.f210003a = str;
        this.f210004b = if71Var;
        this.f210005c = list;
        this.f210006d = list2;
        this.f210007e = hzzVar;
        this.f210008f = yqqVar;
        float fMo24619j = yqqVar.mo24619j();
        mr4 mr4Var = new mr4(1);
        ((TextPaint) mr4Var).density = fMo24619j;
        mr4Var.f146415b = TextDecoration.f538b;
        mr4Var.f146416c = 3;
        Shadow shadow = Shadow.f496d;
        mr4Var.f146417d = hqg1.m48280m();
        this.f210009g = mr4Var;
        boolean zM79147e = srz.m79147e(if71Var);
        ew31 ew31Var2 = if71Var.f101704a;
        vsm0 vsm0Var2 = if71Var.f101705b;
        boolean z = false;
        z = false;
        if (zM79147e) {
            xvo xvoVar = t7u.f217898a;
            zBooleanValue = ((Boolean) t7u.f217898a.m92247f().getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.f210001X = zBooleanValue;
        this.f210002Y = srz.m79165w(vsm0Var2.f244464b, ew31Var2.f63420k);
        rk4 rk4Var = new rk4(this, z ? 1 : 0);
        tug1.m81587y(mr4Var, vsm0Var2.f244471i);
        int size = list.size();
        int i = 0;
        while (true) {
            u8uVar = null;
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((i15) obj).f97388a instanceof ew31) {
                break;
            } else {
                i++;
            }
        }
        ew31 ew31VarM81572j = tug1.m81572j(mr4Var, ew31Var2, rk4Var, yqqVar, obj != null);
        if (ew31VarM81572j != null) {
            int size2 = this.f210005c.size() + 1;
            arrayList = new ArrayList(size2);
            int i2 = 0;
            while (i2 < size2) {
                arrayList.add(i2 == 0 ? new i15(ew31VarM81572j, 0, this.f210003a.length()) : (i15) this.f210005c.get(i2 - 1));
                i2++;
            }
        } else {
            arrayList = this.f210005c;
        }
        String str2 = this.f210003a;
        float textSize = this.f210009g.getTextSize();
        if71 if71Var2 = this.f210004b;
        List list3 = this.f210006d;
        yqq yqqVar3 = this.f210008f;
        boolean z2 = this.f210001X;
        pk4 pk4Var = qk4.f189422a;
        if (z2 && p7u.m69298d()) {
            eeo0 eeo0Var2 = if71Var2.f101706c;
            if (eeo0Var2 != null && (ndo0Var2 = eeo0Var2.f58826b) != null) {
                u8uVar = new u8u(ndo0Var2.f152816b);
            }
            CharSequence charSequenceM69304h = p7u.m69297a().m69304h(0, str2.length(), (u8uVar == null || u8uVar.f228017a != 2) ? 0 : 1, str2);
            wj50.m88279p(charSequenceM69304h);
            charSequence = charSequenceM69304h;
        } else {
            charSequence = str2;
        }
        if (arrayList.isEmpty() && list3.isEmpty()) {
            ca71 ca71Var = if71Var2.f101705b.f244466d;
            ca71 ca71Var2 = ca71.f35759c;
            if (!wj50.m88271j(ca71Var, bug1.m30535x()) || (if71Var2.f101705b.f244465c & 1095216660480L) != 0) {
                charSequence2 = charSequence;
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                ew31Var = if71Var2.f101704a;
                vsm0Var = if71Var2.f101705b;
                if (wj50.m88271j(ew31Var.f63422m, TextDecoration.f539c)) {
                    mjx0.m62014R(spannableString, qk4.f189422a, 0, str2.length());
                }
                eeo0Var = if71Var2.f101706c;
                if (eeo0Var != null) {
                    z = ndo0Var.f152815a;
                }
                if (z) {
                    dk80VarM50283j = vsm0Var.f244468f;
                    if (dk80VarM50283j == null) {
                        dk80 dk80Var = dk80.f49923d;
                        dk80VarM50283j = id6.m50283j();
                    }
                    mjx0.m62011O(spannableString, vsm0Var.f244465c, textSize, yqqVar3, dk80VarM50283j);
                    f = textSize;
                    yqqVar2 = yqqVar3;
                } else {
                    dk80VarM50283j = vsm0Var.f244468f;
                    if (dk80VarM50283j == null) {
                        dk80 dk80Var2 = dk80.f49923d;
                        dk80VarM50283j = id6.m50283j();
                    }
                    mjx0.m62011O(spannableString, vsm0Var.f244465c, textSize, yqqVar3, dk80VarM50283j);
                    f = textSize;
                    yqqVar2 = yqqVar3;
                }
                mjx0.m62016T(spannableString, vsm0Var.f244466d, f, yqqVar2);
                mjx0.m62015S(spannableString, if71Var2, arrayList, yqqVar2, rk4Var);
                mjx0.m62008L(spannableString, arrayList, f, yqqVar2, vsm0Var.f244466d);
                fzg1.m43217t(spannableString, list3, yqqVar2);
                charSequence2 = spannableString;
            }
        } else {
            charSequence2 = charSequence;
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            ew31Var = if71Var2.f101704a;
            vsm0Var = if71Var2.f101705b;
            if (wj50.m88271j(ew31Var.f63422m, TextDecoration.f539c)) {
                mjx0.m62014R(spannableString, qk4.f189422a, 0, str2.length());
            }
            eeo0Var = if71Var2.f101706c;
            if (eeo0Var != null && (ndo0Var = eeo0Var.f58826b) != null) {
                z = ndo0Var.f152815a;
            }
            if (z || vsm0Var.f244468f != null) {
                dk80VarM50283j = vsm0Var.f244468f;
                if (dk80VarM50283j == null) {
                    dk80 dk80Var3 = dk80.f49923d;
                    dk80VarM50283j = id6.m50283j();
                }
                mjx0.m62011O(spannableString, vsm0Var.f244465c, textSize, yqqVar3, dk80VarM50283j);
                f = textSize;
                yqqVar2 = yqqVar3;
            } else {
                mjx0.m62012P(spannableString, vsm0Var.f244465c, textSize, yqqVar3);
                f = textSize;
                yqqVar2 = yqqVar3;
            }
            mjx0.m62016T(spannableString, vsm0Var.f244466d, f, yqqVar2);
            mjx0.m62015S(spannableString, if71Var2, arrayList, yqqVar2, rk4Var);
            mjx0.m62008L(spannableString, arrayList, f, yqqVar2, vsm0Var.f244466d);
            fzg1.m43217t(spannableString, list3, yqqVar2);
            charSequence2 = spannableString;
        }
        charSequence2 = charSequence;
        this.f210010h = charSequence2;
        this.f210011i = new uo70(charSequence2, this.f210009g, this.f210002Y);
    }

    @Override // p204p.psm0
    /* JADX INFO: renamed from: a */
    public final boolean mo29901a() {
        oa81 oa81Var = this.f210012t;
        if (oa81Var != null ? oa81Var.m66533j() : false) {
            return true;
        }
        if (!this.f210001X && srz.m79147e(this.f210004b)) {
            xvo xvoVar = t7u.f217898a;
            if (((Boolean) t7u.f217898a.m92247f().getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.psm0
    /* JADX INFO: renamed from: b */
    public final float mo29902b() {
        return this.f210011i.m83593a();
    }

    @Override // p204p.psm0
    /* JADX INFO: renamed from: c */
    public final float mo29903c() {
        float f;
        uo70 uo70Var = this.f210011i;
        float f2 = uo70Var.f232349e;
        CharSequence charSequence = uo70Var.f232345a;
        TextPaint textPaint = uo70Var.f232346b;
        if (!Float.isNaN(f2)) {
            return uo70Var.f232349e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new iuc(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, vgf1.f241237a);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new b450(i, next, 1));
            } else {
                b450 b450Var = (b450) priorityQueue.peek();
                if (b450Var != null && b450Var.f278779b - b450Var.f278778a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new b450(i, next, 1));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            b450 b450Var2 = (b450) it.next();
            int i2 = b450Var2.f278778a;
            int i3 = b450Var2.f278779b;
            CharSequence charSequenceM85435f = uo70Var.f232352h;
            if (charSequenceM85435f == null) {
                charSequenceM85435f = vgf1.m85435f(charSequence);
                uo70Var.f232352h = charSequenceM85435f;
            }
            float desiredWidth = Layout.getDesiredWidth(charSequenceM85435f, i2, i3, textPaint);
            while (it.hasNext()) {
                b450 b450Var3 = (b450) it.next();
                int i4 = b450Var3.f278778a;
                int i5 = b450Var3.f278779b;
                CharSequence charSequenceM85435f2 = uo70Var.f232352h;
                if (charSequenceM85435f2 == null) {
                    charSequenceM85435f2 = vgf1.m85435f(charSequence);
                    uo70Var.f232352h = charSequenceM85435f2;
                }
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(charSequenceM85435f2, i4, i5, textPaint));
            }
            f = desiredWidth;
        }
        uo70Var.f232349e = f;
        return f;
    }
}
