package p196j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p196j$.time.chrono.C1542s;
import p196j$.time.chrono.InterfaceC1535l;
import p196j$.time.chrono.InterfaceC1536m;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.time.format.n */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1566n implements InterfaceC1557e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1607p f10734a;

    /* JADX INFO: renamed from: b */
    public final TextStyle f10735b;

    /* JADX INFO: renamed from: c */
    public final C1553a f10736c;

    /* JADX INFO: renamed from: d */
    public volatile C1560h f10737d;

    public C1566n(InterfaceC1607p interfaceC1607p, TextStyle textStyle, C1553a c1553a) {
        this.f10734a = interfaceC1607p;
        this.f10735b = textStyle;
        this.f10736c = c1553a;
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: E */
    public final int mo24064E(C1570r c1570r, CharSequence charSequence, int i) {
        C1553a c1553a = this.f10736c;
        InterfaceC1607p interfaceC1607p = this.f10734a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = c1570r.f10754c;
        DateTimeFormatter dateTimeFormatter = c1570r.f10752a;
        Iterator it = null;
        TextStyle textStyle = z ? this.f10735b : null;
        InterfaceC1535l interfaceC1535l = c1570r.m24095c().f10762c;
        if (interfaceC1535l == null && (interfaceC1535l = c1570r.f10752a.f10705e) == null) {
            interfaceC1535l = C1542s.f10679c;
        }
        if (interfaceC1535l == null || interfaceC1535l == C1542s.f10679c) {
            Locale locale = dateTimeFormatter.f10702b;
            List list = (List) ((HashMap) ((Map) c1553a.f10709a.f10555c)).get(textStyle);
            it = list != null ? list.iterator() : null;
        } else {
            Locale locale2 = dateTimeFormatter.f10702b;
            List list2 = (List) ((HashMap) ((Map) c1553a.f10709a.f10555c)).get(textStyle);
            if (list2 != null) {
                it = list2.iterator();
            }
        }
        Iterator it2 = it;
        if (it2 != null) {
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str = (String) entry.getKey();
                if (c1570r.m24099g(str, 0, charSequence, i, str.length())) {
                    return c1570r.m24098f(this.f10734a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (interfaceC1607p == EnumC1592a.ERA && !c1570r.f10754c) {
                for (InterfaceC1536m interfaceC1536m : interfaceC1535l.mo24000D()) {
                    String string = interfaceC1536m.toString();
                    if (c1570r.m24099g(string, 0, charSequence, i, string.length())) {
                        return c1570r.m24098f(this.f10734a, interfaceC1536m.getValue(), i, string.length() + i);
                    }
                }
            }
            if (c1570r.f10754c) {
                return ~i;
            }
        }
        if (this.f10737d == null) {
            this.f10737d = new C1560h(this.f10734a, 1, 19, EnumC1576x.NORMAL);
        }
        return this.f10737d.mo24064E(c1570r, charSequence, i);
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: r */
    public final boolean mo24065r(C1571s c1571s, StringBuilder sb) {
        String strM23919a;
        Long lM24100a = c1571s.m24100a(this.f10734a);
        DateTimeFormatter dateTimeFormatter = c1571s.f10757b;
        if (lM24100a == null) {
            return false;
        }
        InterfaceC1535l interfaceC1535l = (InterfaceC1535l) c1571s.f10756a.mo23841b(AbstractC1608q.f10835b);
        if (interfaceC1535l == null || interfaceC1535l == C1542s.f10679c) {
            C1553a c1553a = this.f10736c;
            long jLongValue = lM24100a.longValue();
            TextStyle textStyle = this.f10735b;
            Locale locale = dateTimeFormatter.f10702b;
            strM23919a = c1553a.f10709a.m23919a(jLongValue, textStyle);
        } else {
            C1553a c1553a2 = this.f10736c;
            long jLongValue2 = lM24100a.longValue();
            TextStyle textStyle2 = this.f10735b;
            Locale locale2 = dateTimeFormatter.f10702b;
            strM23919a = c1553a2.f10709a.m23919a(jLongValue2, textStyle2);
        }
        if (strM23919a != null) {
            sb.append(strM23919a);
            return true;
        }
        if (this.f10737d == null) {
            this.f10737d = new C1560h(this.f10734a, 1, 19, EnumC1576x.NORMAL);
        }
        return this.f10737d.mo24065r(c1571s, sb);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        InterfaceC1607p interfaceC1607p = this.f10734a;
        TextStyle textStyle2 = this.f10735b;
        if (textStyle2 == textStyle) {
            return "Text(" + interfaceC1607p + ")";
        }
        return "Text(" + interfaceC1607p + "," + textStyle2 + ")";
    }
}
