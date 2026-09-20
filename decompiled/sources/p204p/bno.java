package p204p;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import org.threeten.p203bp.DateTimeException;
import org.threeten.p203bp.format.DateTimeParseException;

/* JADX INFO: loaded from: classes2.dex */
public final class bno {

    /* JADX INFO: renamed from: g */
    public static final bno f28898g;

    /* JADX INFO: renamed from: h */
    public static final bno f28899h;

    /* JADX INFO: renamed from: i */
    public static final bno f28900i;

    /* JADX INFO: renamed from: j */
    public static final bno f28901j;

    /* JADX INFO: renamed from: k */
    public static final bno f28902k;

    /* JADX INFO: renamed from: a */
    public final eno f28903a;

    /* JADX INFO: renamed from: b */
    public final Locale f28904b;

    /* JADX INFO: renamed from: c */
    public final zpo f28905c;

    /* JADX INFO: renamed from: d */
    public final z0x0 f28906d;

    /* JADX INFO: renamed from: e */
    public final ice f28907e;

    /* JADX INFO: renamed from: f */
    public final gze1 f28908f;

    static {
        uno unoVar = new uno();
        dce dceVar = dce.YEAR;
        unoVar.m83581m(dceVar, 4, 10, 5);
        unoVar.m83571c('-');
        dce dceVar2 = dce.MONTH_OF_YEAR;
        unoVar.m83580l(dceVar2, 2);
        unoVar.m83571c('-');
        dce dceVar3 = dce.DAY_OF_MONTH;
        unoVar.m83580l(dceVar3, 2);
        z0x0 z0x0Var = z0x0.f278180a;
        bno bnoVarM83586r = unoVar.m83586r(z0x0Var);
        np50 np50Var = np50.f156881a;
        bno bnoVarM30064i = bnoVarM83586r.m30064i();
        f28898g = bnoVarM30064i;
        uno unoVar2 = new uno();
        ono onoVar = ono.f167307b;
        unoVar2.m83570b(onoVar);
        unoVar2.m83569a(bnoVarM30064i);
        lno lnoVar = lno.f135191d;
        unoVar2.m83570b(lnoVar);
        unoVar2.m83586r(z0x0Var).m30064i();
        uno unoVar3 = new uno();
        unoVar3.m83570b(onoVar);
        unoVar3.m83569a(bnoVarM30064i);
        unoVar3.m83583o();
        unoVar3.m83570b(lnoVar);
        unoVar3.m83586r(z0x0Var).m30064i();
        uno unoVar4 = new uno();
        dce dceVar4 = dce.HOUR_OF_DAY;
        unoVar4.m83580l(dceVar4, 2);
        unoVar4.m83571c(':');
        dce dceVar5 = dce.MINUTE_OF_HOUR;
        unoVar4.m83580l(dceVar5, 2);
        unoVar4.m83583o();
        unoVar4.m83571c(':');
        dce dceVar6 = dce.SECOND_OF_MINUTE;
        unoVar4.m83580l(dceVar6, 2);
        unoVar4.m83583o();
        unoVar4.m83570b(new gno(dce.NANO_OF_SECOND, 0, 9, true));
        bno bnoVarM83586r2 = unoVar4.m83586r(z0x0Var);
        uno unoVar5 = new uno();
        unoVar5.m83570b(onoVar);
        unoVar5.m83569a(bnoVarM83586r2);
        unoVar5.m83570b(lnoVar);
        unoVar5.m83586r(z0x0Var);
        uno unoVar6 = new uno();
        unoVar6.m83570b(onoVar);
        unoVar6.m83569a(bnoVarM83586r2);
        unoVar6.m83583o();
        unoVar6.m83570b(lnoVar);
        unoVar6.m83586r(z0x0Var);
        uno unoVar7 = new uno();
        unoVar7.m83570b(onoVar);
        unoVar7.m83569a(bnoVarM30064i);
        unoVar7.m83571c('T');
        unoVar7.m83569a(bnoVarM83586r2);
        bno bnoVarM30064i2 = unoVar7.m83586r(z0x0Var).m30064i();
        f28899h = bnoVarM30064i2;
        uno unoVar8 = new uno();
        unoVar8.m83570b(onoVar);
        unoVar8.m83569a(bnoVarM30064i2);
        unoVar8.m83570b(lnoVar);
        bno bnoVarM30064i3 = unoVar8.m83586r(z0x0Var).m30064i();
        f28900i = bnoVarM30064i3;
        uno unoVar9 = new uno();
        unoVar9.m83569a(bnoVarM30064i3);
        unoVar9.m83583o();
        unoVar9.m83571c('[');
        ono onoVar2 = ono.f167306a;
        unoVar9.m83570b(onoVar2);
        tc5 tc5Var = uno.f232200h;
        unoVar9.m83570b(new sno(tc5Var, "ZoneRegionId()"));
        unoVar9.m83571c(']');
        unoVar9.m83586r(z0x0Var).m30064i();
        uno unoVar10 = new uno();
        unoVar10.m83569a(bnoVarM30064i2);
        unoVar10.m83583o();
        unoVar10.m83570b(lnoVar);
        unoVar10.m83583o();
        unoVar10.m83571c('[');
        unoVar10.m83570b(onoVar2);
        unoVar10.m83570b(new sno(tc5Var, "ZoneRegionId()"));
        unoVar10.m83571c(']');
        f28901j = unoVar10.m83586r(z0x0Var).m30064i();
        uno unoVar11 = new uno();
        unoVar11.m83570b(onoVar);
        unoVar11.m83581m(dceVar, 4, 10, 5);
        unoVar11.m83571c('-');
        unoVar11.m83580l(dce.DAY_OF_YEAR, 3);
        unoVar11.m83583o();
        unoVar11.m83570b(lnoVar);
        unoVar11.m83586r(z0x0Var).m30064i();
        uno unoVar12 = new uno();
        unoVar12.m83570b(onoVar);
        tp50 tp50Var = up50.f232582a;
        unoVar12.m83581m(sp50.f212737d, 4, 10, 5);
        unoVar12.m83572d("-W");
        unoVar12.m83580l(sp50.f212736c, 2);
        unoVar12.m83571c('-');
        dce dceVar7 = dce.DAY_OF_WEEK;
        unoVar12.m83580l(dceVar7, 1);
        unoVar12.m83583o();
        unoVar12.m83570b(lnoVar);
        unoVar12.m83586r(z0x0Var).m30064i();
        uno unoVar13 = new uno();
        unoVar13.m83570b(onoVar);
        unoVar13.m83570b(new hno());
        f28902k = unoVar13.m83586r(z0x0Var);
        uno unoVar14 = new uno();
        unoVar14.m83570b(onoVar);
        unoVar14.m83580l(dceVar, 4);
        unoVar14.m83580l(dceVar2, 2);
        unoVar14.m83580l(dceVar3, 2);
        unoVar14.m83583o();
        unoVar14.m83574f("+HHMMss", "Z");
        unoVar14.m83586r(z0x0Var).m30064i();
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        uno unoVar15 = new uno();
        unoVar15.m83570b(onoVar);
        unoVar15.m83570b(ono.f167308c);
        unoVar15.m83583o();
        unoVar15.m83576h(dceVar7, map);
        unoVar15.m83572d(", ");
        unoVar15.m83582n();
        unoVar15.m83581m(dceVar3, 1, 2, 4);
        unoVar15.m83571c(' ');
        unoVar15.m83576h(dceVar2, map2);
        unoVar15.m83571c(' ');
        unoVar15.m83580l(dceVar, 4);
        unoVar15.m83571c(' ');
        unoVar15.m83580l(dceVar4, 2);
        unoVar15.m83571c(':');
        unoVar15.m83580l(dceVar5, 2);
        unoVar15.m83583o();
        unoVar15.m83571c(':');
        unoVar15.m83580l(dceVar6, 2);
        unoVar15.m83582n();
        unoVar15.m83571c(' ');
        unoVar15.m83574f("+HHMM", "GMT");
        unoVar15.m83586r(z0x0.f278181b).m30064i();
    }

    public bno(eno enoVar, Locale locale, zpo zpoVar, z0x0 z0x0Var, ice iceVar, gze1 gze1Var) {
        jlg1.m53716z(enoVar, "printerParser");
        this.f28903a = enoVar;
        jlg1.m53716z(locale, "locale");
        this.f28904b = locale;
        jlg1.m53716z(zpoVar, "decimalStyle");
        this.f28905c = zpoVar;
        jlg1.m53716z(z0x0Var, "resolverStyle");
        this.f28906d = z0x0Var;
        this.f28907e = iceVar;
        this.f28908f = gze1Var;
    }

    /* JADX INFO: renamed from: b */
    public static bno m30056b(b400 b400Var) {
        jlg1.m53716z(b400Var, "dateStyle");
        uno unoVar = new uno();
        unoVar.m83570b(new jno(b400Var, null));
        bno bnoVarM83584p = unoVar.m83584p();
        np50 np50Var = np50.f156881a;
        return bnoVarM83584p.m30064i();
    }

    /* JADX INFO: renamed from: c */
    public static bno m30057c() {
        uno unoVar = new uno();
        unoVar.m83570b(new jno(null, b400.f23159d));
        bno bnoVarM83584p = unoVar.m83584p();
        np50 np50Var = np50.f156881a;
        return bnoVarM83584p.m30064i();
    }

    /* JADX INFO: renamed from: d */
    public static bno m30058d(String str) {
        uno unoVar = new uno();
        unoVar.m83575g(str);
        return unoVar.m83584p();
    }

    /* JADX INFO: renamed from: e */
    public static bno m30059e(String str, Locale locale) {
        uno unoVar = new uno();
        unoVar.m83575g(str);
        return unoVar.m83585q(locale);
    }

    /* JADX INFO: renamed from: a */
    public final String m30060a(bz61 bz61Var) {
        StringBuilder sb = new StringBuilder(32);
        eno enoVar = this.f28903a;
        jlg1.m53716z(bz61Var, "temporal");
        try {
            enoVar.mo36485a(new t0h1(bz61Var, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m30061f(CharSequence charSequence, fz61 fz61Var) {
        String string;
        jlg1.m53716z(charSequence, "text");
        jlg1.m53716z(fz61Var, "type");
        try {
            ano anoVarM30062g = m30062g(charSequence);
            anoVarM30062g.m26527t6(this.f28906d);
            return anoVarM30062g.m26520m6(fz61Var);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            StringBuilder sbM38572u = edb.m38572u("Text '", string, "' could not be parsed: ");
            sbM38572u.append(e2.getMessage());
            DateTimeParseException dateTimeParseException = new DateTimeParseException(sbM38572u.toString(), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX INFO: renamed from: g */
    public final ano m30062g(CharSequence charSequence) {
        vno vnoVarM69569w;
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        jlg1.m53716z(charSequence, "text");
        pcb pcbVar = new pcb(this);
        int iMo36486b = this.f28903a.mo36486b(pcbVar, charSequence, parsePosition.getIndex());
        if (iMo36486b < 0) {
            parsePosition.setErrorIndex(~iMo36486b);
            vnoVarM69569w = null;
        } else {
            parsePosition.setIndex(iMo36486b);
            vnoVarM69569w = pcbVar.m69569w();
        }
        if (vnoVarM69569w != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            return vnoVarM69569w.m86051l6();
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            StringBuilder sbM38572u = edb.m38572u("Text '", string, "' could not be parsed at index ");
            sbM38572u.append(parsePosition.getErrorIndex());
            String string2 = sbM38572u.toString();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(string2, charSequence);
        }
        StringBuilder sbM38572u2 = edb.m38572u("Text '", string, "' could not be parsed, unparsed text found at index ");
        sbM38572u2.append(parsePosition.getIndex());
        String string3 = sbM38572u2.toString();
        parsePosition.getIndex();
        throw new DateTimeParseException(string3, charSequence);
    }

    /* JADX INFO: renamed from: h */
    public final eno m30063h() {
        eno enoVar = this.f28903a;
        return !enoVar.f61187b ? enoVar : new eno(enoVar.f61186a, false);
    }

    /* JADX INFO: renamed from: i */
    public final bno m30064i() {
        np50 np50Var = np50.f156881a;
        if (jlg1.m53704n(this.f28907e, np50Var)) {
            return this;
        }
        return new bno(this.f28903a, this.f28904b, this.f28905c, this.f28906d, np50Var, this.f28908f);
    }

    /* JADX INFO: renamed from: j */
    public final bno m30065j(Locale locale) {
        if (this.f28904b.equals(locale)) {
            return this;
        }
        return new bno(this.f28903a, locale, this.f28905c, this.f28906d, this.f28907e, this.f28908f);
    }

    /* JADX INFO: renamed from: k */
    public final bno m30066k(gze1 gze1Var) {
        if (jlg1.m53704n(this.f28908f, gze1Var)) {
            return this;
        }
        return new bno(this.f28903a, this.f28904b, this.f28905c, this.f28906d, this.f28907e, gze1Var);
    }

    public final String toString() {
        String string = this.f28903a.toString();
        return string.startsWith("[") ? string : dq60.m36609i(1, 1, string);
    }
}
