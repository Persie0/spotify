package p204p;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.style.BaselineShift;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u9y0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228309a;

    public /* synthetic */ u9y0(int i) {
        this.f228309a = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Number number;
        n6f n6fVar;
        switch (this.f228309a) {
            case 0:
                return new FontWeight(((Integer) obj).intValue());
            case 1:
                return new BaselineShift(((Float) obj).floatValue());
            case 2:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Integer num = obj2 != null ? (Integer) obj2 : null;
                wj50.m88279p(num);
                int iIntValue = num.intValue();
                Object obj3 = list.get(1);
                number = obj3 != null ? (Integer) obj3 : null;
                wj50.m88279p(number);
                return new ic71(dvg1.m37112n(iIntValue, number.intValue()));
            case 3:
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                int i = n6f.f150872l;
                Boolean bool = Boolean.FALSE;
                wj50.m88271j(obj4, bool);
                if (obj4 == null) {
                    n6fVar = null;
                } else if (obj4.equals(bool)) {
                    int i2 = n6f.f150872l;
                    n6fVar = new n6f(ly5.m60224n());
                } else {
                    n6fVar = new n6f(rfg1.m75432b(((Integer) obj4).intValue()));
                }
                wj50.m88279p(n6fVar);
                long j = n6fVar.f150873a;
                Object obj5 = list2.get(1);
                y9y0 y9y0Var = z9y0.f280932z;
                wj50.m88271j(obj5, bool);
                Offset offset = obj5 != null ? (Offset) y9y0Var.f270692b.invoke(obj5) : null;
                wj50.m88279p(offset);
                long j2 = offset.f493a;
                Object obj6 = list2.get(2);
                number = obj6 != null ? (Float) obj6 : null;
                wj50.m88279p(number);
                return new Shadow(number.floatValue(), j, j2);
            case 4:
                return new h171(((Integer) obj).intValue());
            case 5:
                return k571.m55425a(((Integer) obj).intValue());
            case 6:
                return xt30.m92003a(((Integer) obj).intValue());
            case 7:
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj7 = list3.get(i3);
                    i15 i15Var = (wj50.m88271j(obj7, Boolean.FALSE) || obj7 == null) ? null : (i15) z9y0.f280909c.f218397b.invoke(obj7);
                    wj50.m88279p(i15Var);
                    arrayList.add(i15Var);
                }
                return arrayList;
            case 8:
                return new FontStyle(((Integer) obj).intValue());
            case 9:
                return new FontSynthesis(((Integer) obj).intValue());
            case 10:
                s6q0 s6q0Var = (s6q0) obj;
                return Boolean.valueOf(!(s6q0Var != null ? s6q0.m77340b(s6q0Var.m77342d(), 2) : false));
            case 11:
                u9y0 u9y0Var = ua31.f228349a;
                return w2a1.f247311a;
            default:
                List list4 = (List) obj;
                Object obj8 = list4.get(0);
                t9y0 t9y0Var = z9y0.f280907a;
                Boolean bool2 = Boolean.FALSE;
                j15 j15Var = (wj50.m88271j(obj8, bool2) || obj8 == null) ? null : (j15) t9y0Var.f218397b.invoke(obj8);
                wj50.m88279p(j15Var);
                Object obj9 = list4.get(1);
                int i4 = ic71.f100751c;
                ic71 ic71Var = (wj50.m88271j(obj9, bool2) || obj9 == null) ? null : (ic71) z9y0.f280922p.f218397b.invoke(obj9);
                wj50.m88279p(ic71Var);
                return new o971(j15Var, ic71Var.f100752a, (ic71) null);
        }
    }
}
