package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class blk0 {

    /* JADX INFO: renamed from: a */
    public static final List f28189a = h6f.m46715L("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot");

    /* JADX INFO: renamed from: b */
    public static final List f28190b = h6f.m46715L("com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_");

    /* JADX INFO: renamed from: c */
    public static final List f28191c = h6f.m46715L("com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot");

    /* JADX INFO: renamed from: d */
    public static final List f28192d = h6f.m46715L("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/");

    /* JADX INFO: renamed from: e */
    public static final List f28193e = h6f.m46715L("/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc");

    /* JADX INFO: renamed from: f */
    public static final List f28194f = h6f.m46715L("magisk", "core/mirror", "core/img");

    /* JADX INFO: renamed from: g */
    public static final List f28195g = h6f.m46715L(new pqm0("ro.debuggable", "[1]"), new pqm0("ro.secure", "[0]"));

    /* JADX INFO: renamed from: a */
    public static List m29768a() {
        ArrayList arrayList = new ArrayList();
        List list = f28192d;
        arrayList.addAll(list);
        String str = System.getenv("PATH");
        if (((str == null || str.length() == 0) ? str : null) != null) {
            return list;
        }
        if (str != null) {
            for (String str2 : wl51.m88477a1(str, new String[]{":"}, 0, 6)) {
                boolean zM29796g0 = bm51.m29796g0(str2, "/", false);
                Boolean boolValueOf = Boolean.valueOf(zM29796g0);
                if (zM29796g0) {
                    boolValueOf = null;
                }
                String strConcat = boolValueOf != null ? str2.concat("/") : "";
                boolean zContains = arrayList.contains(strConcat);
                Boolean boolValueOf2 = Boolean.valueOf(zContains);
                if (zContains) {
                    boolValueOf2 = null;
                }
                if (boolValueOf2 != null) {
                    arrayList.add(strConcat);
                }
            }
        }
        return arrayList;
    }
}
