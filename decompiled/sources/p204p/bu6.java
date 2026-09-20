package p204p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bu6 {

    /* JADX INFO: renamed from: e */
    public static final wsv0 f31027e;

    /* JADX INFO: renamed from: f */
    public static final bu6 f31028f;

    /* JADX INFO: renamed from: g */
    public static final wsv0 f31029g;

    /* JADX INFO: renamed from: h */
    public static final xf40 f31030h;

    /* JADX INFO: renamed from: a */
    public final SparseArray f31031a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final int f31032b;

    /* JADX INFO: renamed from: c */
    public final pf40 f31033c;

    /* JADX INFO: renamed from: d */
    public final pf40 f31034d;

    static {
        wsv0 wsv0VarM69794t = pf40.m69794t(12);
        f31027e = wsv0VarM69794t;
        f31028f = new bu6(pf40.m69794t(au6.f19866d), wsv0VarM69794t, wsv0.f254763e);
        Object[] objArr = {2, 5, 6};
        jhl0.m53416j(objArr);
        f31029g = pf40.m69787l(3, objArr);
        vf40 vf40Var = new vf40(4);
        vf40Var.mo85345e(5, 6);
        vf40Var.mo85345e(17, 6);
        vf40Var.mo85345e(7, 6);
        vf40Var.mo85345e(30, 10);
        vf40Var.mo85345e(18, 6);
        vf40Var.mo85345e(6, 8);
        vf40Var.mo85345e(8, 8);
        vf40Var.mo85345e(14, 8);
        f31030h = vf40Var.m85342b(true);
    }

    public bu6(wsv0 wsv0Var, List list, List list2) {
        for (int i = 0; i < wsv0Var.f254765d; i++) {
            au6 au6Var = (au6) wsv0Var.get(i);
            this.f31031a.put(au6Var.f19867a, au6Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f31031a.size(); i2++) {
            iMax = Math.max(iMax, ((au6) this.f31031a.valueAt(i2)).f19868b);
        }
        this.f31032b = iMax;
        this.f31033c = pf40.m69791p(list);
        this.f31034d = pf40.m69791p(list2);
    }

    /* JADX INFO: renamed from: a */
    public static wsv0 m30503a(int[] iArr, int i) {
        jf40 jf40VarM69788m = pf40.m69788m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            jf40VarM69788m.m28985c(new au6(i2, i));
        }
        return jf40VarM69788m.m53150g();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX INFO: renamed from: b */
    public static bu6 m30504b(Context context, Intent intent, xs6 xs6Var, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager audioManagerM43165u = fz6.m43165u(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? AbstractC2254pf.m69767j(audioManagerM43165u, xs6Var) : null;
        }
        pf40 pf40VarM48967b = audioDeviceInfo != null ? hx31.m48967b(audioDeviceInfo) : f31027e;
        if (Build.VERSION.SDK_INT >= 33 && (h0b1.m46292T(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return AbstractC2254pf.m69765h(audioManagerM43165u, xs6Var, pf40VarM48967b, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? audioManagerM43165u.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (qqg1.m73551u(audioDeviceInfo2.getType())) {
                return new bu6(pf40.m69794t(au6.f19866d), pf40VarM48967b, list);
            }
        }
        fg40 fg40Var = new fg40(4);
        fg40Var.m41574g(2);
        if (Build.VERSION.SDK_INT >= 29 && (h0b1.m46292T(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            fg40Var.m41575h(lzj.m60388x(xs6Var));
            return new bu6(m30503a(k0e1.m54979N(fg40Var.m41576i()), 10), pf40VarM48967b, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    fg40Var.m41575h(f31029g);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            fg40Var.m41575h(f31029g);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new bu6(m30503a(k0e1.m54979N(fg40Var.m41576i()), 10), pf40VarM48967b, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            fg40Var.m41575h(k0e1.m54987f(intArrayExtra));
        }
        return new bu6(m30503a(k0e1.m54979N(fg40Var.m41576i()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), pf40VarM48967b, list);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX INFO: renamed from: c */
    public final Pair m30505c(xs6 xs6Var, r300 r300Var) {
        String str = r300Var.f195387p;
        int iM46336x = r300Var.f195361K;
        int i = r300Var.f195360J;
        str.getClass();
        int iM35787d = def0.m35787d(str, r300Var.f195383l);
        Integer numValueOf = Integer.valueOf(iM35787d);
        xf40 xf40Var = f31030h;
        if (!xf40Var.containsKey(numValueOf)) {
            return null;
        }
        int i2 = 6;
        SparseArray sparseArray = this.f31031a;
        if (iM35787d == 18 && !h0b1.m46321l(sparseArray, 18)) {
            iM35787d = 6;
        } else if ((iM35787d == 8 && !h0b1.m46321l(sparseArray, 8)) || (iM35787d == 30 && !h0b1.m46321l(sparseArray, 30))) {
            iM35787d = 7;
        }
        if (!h0b1.m46321l(sparseArray, iM35787d)) {
            return null;
        }
        au6 au6Var = (au6) sparseArray.get(iM35787d);
        au6Var.getClass();
        int iIntValue = au6Var.f19868b;
        hg40 hg40Var = au6Var.f19869c;
        boolean zContains = false;
        if (i == -1 || iM35787d == 18) {
            int i3 = r300Var.f195362L;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = au6Var.f19867a;
            if (hg40Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = lzj.m60329G(i4, i3, xs6Var);
                } else {
                    Object obj = xf40Var.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
        } else {
            if (!r300Var.f195387p.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                if (hg40Var != null) {
                    int iM46336x2 = iM46336x != -1 ? iM46336x : h0b1.m46336x(i);
                    if (iM46336x2 != 0) {
                        zContains = hg40Var.contains(Integer.valueOf(iM46336x2));
                    }
                } else if (i <= iIntValue) {
                    zContains = true;
                }
                if (!zContains) {
                    return null;
                }
            } else if (i > 10) {
                return null;
            }
            iIntValue = i;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i2 = iIntValue;
        } else if (iIntValue == 7) {
            i2 = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i2 = iIntValue;
        }
        HashSet hashSet = dgd0.f48781a;
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
            i2 = 2;
        }
        if (iM46336x == -1 || i != i2) {
            iM46336x = h0b1.m46336x(i2);
        }
        if (iM46336x == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM35787d), Integer.valueOf(iM46336x));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu6)) {
            return false;
        }
        bu6 bu6Var = (bu6) obj;
        return h0b1.m46325n(this.f31031a, bu6Var.f31031a) && this.f31032b == bu6Var.f31032b && Objects.equals(this.f31033c, bu6Var.f31033c) && Objects.equals(this.f31034d, bu6Var.f31034d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f31034d) + ((Objects.hashCode(this.f31033c) + ((h0b1.m46327o(this.f31031a) + (this.f31032b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f31032b + ", audioProfiles=" + this.f31031a + ", speakerLayoutChannelMasks=" + this.f31033c + ", spatializerChannelMasks=" + this.f31034d + "]";
    }
}
