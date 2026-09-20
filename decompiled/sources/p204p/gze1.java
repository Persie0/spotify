package p204p;

import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.threeten.p203bp.DateTimeException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gze1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Map f85905a;

    static {
        HashMap map = new HashMap();
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("ART", "Africa/Cairo");
        map.put("AST", "America/Anchorage");
        map.put("BET", "America/Sao_Paulo");
        map.put("BST", "Asia/Dhaka");
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("ECT", "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
        map.put("MIT", "Pacific/Apia");
        map.put("NET", "Asia/Yerevan");
        map.put("NST", "Pacific/Auckland");
        map.put("PLT", "Asia/Karachi");
        map.put("PNT", "America/Phoenix");
        map.put("PRT", "America/Puerto_Rico");
        map.put("PST", "America/Los_Angeles");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("EST", "-05:00");
        map.put("MST", "-07:00");
        map.put("HST", "-10:00");
        f85905a = Collections.unmodifiableMap(map);
    }

    public gze1() {
        if (getClass() != hze1.class && getClass() != kze1.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* JADX INFO: renamed from: a */
    public static gze1 m46196a(bz61 bz61Var) {
        gze1 gze1Var = (gze1) bz61Var.mo26518k(ez61.f64288d);
        if (gze1Var != null) {
            return gze1Var;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + bz61Var + ", type " + bz61Var.getClass().getName());
    }

    /* JADX INFO: renamed from: n */
    public static gze1 m46197n(String str) {
        jlg1.m53716z(str, "zoneId");
        if (str.equals("Z")) {
            return hze1.f96907f;
        }
        if (str.length() == 1) {
            throw new DateTimeException("Invalid zone: ".concat(str));
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            return hze1.m49267s(str);
        }
        if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            hze1 hze1Var = hze1.f96907f;
            hze1Var.getClass();
            return new kze1(str, new lze1(hze1Var));
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            hze1 hze1VarM49267s = hze1.m49267s(str.substring(3));
            if (hze1VarM49267s.f96910b == 0) {
                return new kze1(str.substring(0, 3), new lze1(hze1VarM49267s));
            }
            return new kze1(str.substring(0, 3) + hze1VarM49267s.f96911c, new lze1(hze1VarM49267s));
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return kze1.m57754r(str, true);
        }
        hze1 hze1VarM49267s2 = hze1.m49267s(str.substring(2));
        if (hze1VarM49267s2.f96910b == 0) {
            return new kze1("UT", new lze1(hze1VarM49267s2));
        }
        return new kze1("UT" + hze1VarM49267s2.f96911c, new lze1(hze1VarM49267s2));
    }

    /* JADX INFO: renamed from: o */
    public static gze1 m46198o(String str, hze1 hze1Var) {
        jlg1.m53716z(str, "prefix");
        jlg1.m53716z(hze1Var, "offset");
        if (str.length() == 0) {
            return hze1Var;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: ".concat(str));
        }
        if (hze1Var.f96910b == 0) {
            return new kze1(str, new lze1(hze1Var));
        }
        StringBuilder sbM36620t = dq60.m36620t(str);
        sbM36620t.append(hze1Var.f96911c);
        return new kze1(sbM36620t.toString(), new lze1(hze1Var));
    }

    /* JADX INFO: renamed from: p */
    public static gze1 m46199p() {
        String id = TimeZone.getDefault().getID();
        jlg1.m53716z(id, "zoneId");
        Map map = f85905a;
        jlg1.m53716z(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return m46197n(id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gze1) {
            return getId().equals(((gze1) obj).getId());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract mze1 mo46200f();

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo46201q(ObjectOutput objectOutput);

    public String toString() {
        return getId();
    }
}
