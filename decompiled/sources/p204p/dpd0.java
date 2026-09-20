package p204p;

import android.os.Bundle;
import com.spotify.player.model.SleepTimer;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dpd0 {

    /* JADX INFO: renamed from: A */
    public final String f51276A;

    /* JADX INFO: renamed from: B */
    public final List f51277B;

    /* JADX INFO: renamed from: C */
    public final Set f51278C;

    /* JADX INFO: renamed from: D */
    public final String f51279D;

    /* JADX INFO: renamed from: E */
    public final String f51280E;

    /* JADX INFO: renamed from: F */
    public final String f51281F;

    /* JADX INFO: renamed from: a */
    public final boolean f51282a;

    /* JADX INFO: renamed from: b */
    public final String f51283b;

    /* JADX INFO: renamed from: c */
    public final String f51284c;

    /* JADX INFO: renamed from: d */
    public final String f51285d;

    /* JADX INFO: renamed from: e */
    public final String f51286e;

    /* JADX INFO: renamed from: f */
    public final String f51287f;

    /* JADX INFO: renamed from: g */
    public final String f51288g;

    /* JADX INFO: renamed from: h */
    public final String f51289h;

    /* JADX INFO: renamed from: i */
    public final Integer f51290i;

    /* JADX INFO: renamed from: j */
    public final Boolean f51291j;

    /* JADX INFO: renamed from: k */
    public final Boolean f51292k;

    /* JADX INFO: renamed from: l */
    public final Boolean f51293l;

    /* JADX INFO: renamed from: m */
    public final Boolean f51294m;

    /* JADX INFO: renamed from: n */
    public final Boolean f51295n;

    /* JADX INFO: renamed from: o */
    public final String f51296o;

    /* JADX INFO: renamed from: p */
    public final String f51297p;

    /* JADX INFO: renamed from: q */
    public final String f51298q;

    /* JADX INFO: renamed from: r */
    public final SleepTimer f51299r;

    /* JADX INFO: renamed from: s */
    public final Boolean f51300s;

    /* JADX INFO: renamed from: t */
    public final Boolean f51301t;

    /* JADX INFO: renamed from: u */
    public final Boolean f51302u;

    /* JADX INFO: renamed from: v */
    public final Boolean f51303v;

    /* JADX INFO: renamed from: w */
    public final Boolean f51304w;

    /* JADX INFO: renamed from: x */
    public final Boolean f51305x;

    /* JADX INFO: renamed from: y */
    public final String f51306y;

    /* JADX INFO: renamed from: z */
    public final String f51307z;

    public /* synthetic */ dpd0() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static dpd0 m36570a(dpd0 dpd0Var, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str8, String str9, String str10, SleepTimer sleepTimer, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str11, String str12, String str13, pf40 pf40Var, Set set, String str14, String str15, String str16, int i) {
        boolean z2 = (i & 1) != 0 ? dpd0Var.f51282a : z;
        return new dpd0(z2, (i & 2) != 0 ? dpd0Var.f51283b : str, (i & 4) != 0 ? dpd0Var.f51284c : str2, (i & 8) != 0 ? dpd0Var.f51285d : str3, (i & 16) != 0 ? dpd0Var.f51286e : str4, (i & 32) != 0 ? dpd0Var.f51287f : str5, (i & 64) != 0 ? dpd0Var.f51288g : str6, (i & 128) != 0 ? dpd0Var.f51289h : str7, (i & 256) != 0 ? dpd0Var.f51290i : num, (i & 512) != 0 ? dpd0Var.f51291j : bool, (i & 1024) != 0 ? dpd0Var.f51292k : bool2, (i & 2048) != 0 ? dpd0Var.f51293l : bool3, (i & 4096) != 0 ? dpd0Var.f51294m : bool4, (i & 8192) != 0 ? dpd0Var.f51295n : bool5, (i & 16384) != 0 ? dpd0Var.f51296o : str8, (i & 32768) != 0 ? dpd0Var.f51297p : str9, (i & 65536) != 0 ? dpd0Var.f51298q : str10, (i & 131072) != 0 ? dpd0Var.f51299r : sleepTimer, (i & 262144) != 0 ? dpd0Var.f51300s : bool6, (i & 524288) != 0 ? dpd0Var.f51301t : bool7, (i & 1048576) != 0 ? dpd0Var.f51302u : bool8, (i & 2097152) != 0 ? dpd0Var.f51303v : bool9, (i & 4194304) != 0 ? dpd0Var.f51304w : bool10, (i & 8388608) != 0 ? dpd0Var.f51305x : bool11, (i & 16777216) != 0 ? dpd0Var.f51306y : str11, (i & 33554432) != 0 ? dpd0Var.f51307z : str12, (i & 67108864) != 0 ? dpd0Var.f51276A : str13, (i & 134217728) != 0 ? dpd0Var.f51277B : pf40Var, (i & 268435456) != 0 ? dpd0Var.f51278C : set, (i & 536870912) != 0 ? dpd0Var.f51279D : str14, (i & 1073741824) != 0 ? dpd0Var.f51280E : str15, (i & Integer.MIN_VALUE) != 0 ? dpd0Var.f51281F : str16);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m36571b() {
        Bundle bundle = new Bundle();
        if (!this.f51282a) {
            bundle.putBoolean("android.media.session.extra.NEED_CONNECT", true);
        }
        bundle.putBoolean("watch_app_auto_launch_enabled", true);
        Bundle bundle2 = new Bundle();
        String str = this.f51283b;
        if (str != null) {
            bundle2.putString("com.spotify.music.extra.CONTEXT_TITLE", str);
        }
        String str2 = this.f51284c;
        if (str2 != null) {
            bundle2.putString("com.spotify.music.extra.ALBUM_TITLE", str2);
        }
        String str3 = this.f51285d;
        if (str3 != null) {
            bundle2.putString("com.spotify.music.extra.STATION_SUBTITLE", str3);
        }
        String str4 = this.f51286e;
        if (str4 != null) {
            bundle2.putString("com.spotify.music.extra.CONTEXT_URI", str4);
        }
        String str5 = this.f51287f;
        if (str5 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_URI", str5);
        }
        String str6 = this.f51288g;
        if (str6 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_UID", str6);
        }
        String str7 = this.f51289h;
        if (str7 != null) {
            bundle2.putString("com.spotify.music.extra.ALBUM_URI", str7);
        }
        Integer num = this.f51290i;
        if (num != null) {
            bundle2.putInt("com.spotify.music.extra.EPISODE_PLAYBACK_SPEED", num.intValue());
        }
        Boolean bool = this.f51291j;
        if (bool != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SEEK_ENABLED", bool.booleanValue());
        }
        Boolean bool2 = this.f51292k;
        if (bool2 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_YOUR_DJ_NARRATOR", bool2.booleanValue());
        }
        Boolean bool3 = this.f51293l;
        if (bool3 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_AUDIOBOOK", bool3.booleanValue());
        }
        Boolean bool4 = this.f51294m;
        if (bool4 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_RECOMMENDATION", bool4.booleanValue());
        }
        Boolean bool5 = this.f51295n;
        if (bool5 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_EXPLICIT", bool5.booleanValue());
        }
        String str8 = this.f51296o;
        if (str8 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_EXTRACTED_COLOR", str8);
        }
        String str9 = this.f51297p;
        if (str9 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_IMAGE_URL", str9);
        }
        String str10 = this.f51298q;
        if (str10 != null) {
            bundle2.putString("com.spotify.music.extra.ARTIST_URI", str10);
        }
        String str11 = this.f51306y;
        if (str11 != null) {
            bundle2.putString("com.spotify.music.extra.REFERRER_IDENTIFIER", str11);
        }
        SleepTimer sleepTimer = this.f51299r;
        if (sleepTimer != null) {
            if (sleepTimer instanceof SleepTimer.Timestamp) {
                bundle2.putString("com.spotify.music.extra.SLEEP_TIMER_TYPE", "com.spotify.music.extra.SLEEP_TIMER_TYPE_TIMESTAMP");
                bundle2.putLong("com.spotify.music.extra.SLEEP_TIMER_TIMESTAMP_VALUE", ((SleepTimer.Timestamp) sleepTimer).timestamp);
            } else if (sleepTimer instanceof SleepTimer.EndOfTrack) {
                bundle2.putString("com.spotify.music.extra.SLEEP_TIMER_TYPE", "com.spotify.music.extra.SLEEP_TIMER_TYPE_END_OF_TRACK");
            } else if (sleepTimer instanceof SleepTimer.None) {
                bundle2.putString("com.spotify.music.extra.SLEEP_TIMER_TYPE", "com.spotify.music.extra.SLEEP_TIMER_TYPE_NONE");
            }
        }
        Boolean bool6 = this.f51300s;
        if (bool6 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SLEEP_TIMER_CLEAR_DISALLOWED", bool6.booleanValue());
        }
        Boolean bool7 = this.f51301t;
        if (bool7 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SLEEP_TIMER_DURATION_DISALLOWED", bool7.booleanValue());
        }
        Boolean bool8 = this.f51302u;
        if (bool8 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SLEEP_TIMER_END_OF_TRACK_DISALLOWED", bool8.booleanValue());
        }
        Boolean bool9 = this.f51303v;
        if (bool9 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_MIX_MODE_ACTIVE", bool9.booleanValue());
        }
        Boolean bool10 = this.f51304w;
        if (bool10 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_SHUFFLE_ACTIVE", bool10.booleanValue());
        }
        Boolean bool11 = this.f51305x;
        if (bool11 != null) {
            bundle2.putBoolean("com.spotify.music.extra.IS_ADDING_TO_QUEUE_DISALLOWED", bool11.booleanValue());
        }
        String str12 = this.f51307z;
        if (str12 != null) {
            bundle2.putString("com.spotify.music.extra.POINTER_NPV_MODE", str12);
        }
        String str13 = this.f51276A;
        if (str13 != null) {
            bundle2.putString("com.spotify.music.extra.POINTER_URI", str13);
        }
        List list = this.f51277B;
        if (list != null) {
            bundle2.putString("com.spotify.music.extra.SIGNALS", g6f.m43753y0(list, ",", null, null, null, 62));
        }
        Set set = this.f51278C;
        if (set != null) {
            bundle2.putString("com.spotify.music.extra.DISALLOW_SIGNALS", g6f.m43753y0(set, ",", null, null, null, 62));
        }
        String str14 = this.f51279D;
        if (str14 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_SAVE_TRACK_URI", str14);
        }
        String str15 = this.f51280E;
        if (str15 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_AUDIO_ASSOCIATION", str15);
        }
        String str16 = this.f51281F;
        if (str16 != null) {
            bundle2.putString("com.spotify.music.extra.TRACK_IS_MUSIC_VIDEO", str16);
        }
        bundle.putBundle("wear_media_bundle", bundle2);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpd0)) {
            return false;
        }
        dpd0 dpd0Var = (dpd0) obj;
        return this.f51282a == dpd0Var.f51282a && wj50.m88271j(this.f51283b, dpd0Var.f51283b) && wj50.m88271j(this.f51284c, dpd0Var.f51284c) && wj50.m88271j(this.f51285d, dpd0Var.f51285d) && wj50.m88271j(this.f51286e, dpd0Var.f51286e) && wj50.m88271j(this.f51287f, dpd0Var.f51287f) && wj50.m88271j(this.f51288g, dpd0Var.f51288g) && wj50.m88271j(this.f51289h, dpd0Var.f51289h) && wj50.m88271j(this.f51290i, dpd0Var.f51290i) && wj50.m88271j(this.f51291j, dpd0Var.f51291j) && wj50.m88271j(this.f51292k, dpd0Var.f51292k) && wj50.m88271j(this.f51293l, dpd0Var.f51293l) && wj50.m88271j(this.f51294m, dpd0Var.f51294m) && wj50.m88271j(this.f51295n, dpd0Var.f51295n) && wj50.m88271j(this.f51296o, dpd0Var.f51296o) && wj50.m88271j(this.f51297p, dpd0Var.f51297p) && wj50.m88271j(this.f51298q, dpd0Var.f51298q) && wj50.m88271j(this.f51299r, dpd0Var.f51299r) && wj50.m88271j(this.f51300s, dpd0Var.f51300s) && wj50.m88271j(this.f51301t, dpd0Var.f51301t) && wj50.m88271j(this.f51302u, dpd0Var.f51302u) && wj50.m88271j(this.f51303v, dpd0Var.f51303v) && wj50.m88271j(this.f51304w, dpd0Var.f51304w) && wj50.m88271j(this.f51305x, dpd0Var.f51305x) && wj50.m88271j(this.f51306y, dpd0Var.f51306y) && wj50.m88271j(this.f51307z, dpd0Var.f51307z) && wj50.m88271j(this.f51276A, dpd0Var.f51276A) && wj50.m88271j(this.f51277B, dpd0Var.f51277B) && wj50.m88271j(this.f51278C, dpd0Var.f51278C) && wj50.m88271j(this.f51279D, dpd0Var.f51279D) && wj50.m88271j(this.f51280E, dpd0Var.f51280E) && wj50.m88271j(this.f51281F, dpd0Var.f51281F);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f51282a) * 31;
        String str = this.f51283b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51284c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f51285d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f51286e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f51287f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f51288g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f51289h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.f51290i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f51291j;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f51292k;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f51293l;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f51294m;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f51295n;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str8 = this.f51296o;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f51297p;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f51298q;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        SleepTimer sleepTimer = this.f51299r;
        int iHashCode18 = (iHashCode17 + (sleepTimer == null ? 0 : sleepTimer.hashCode())) * 31;
        Boolean bool6 = this.f51300s;
        int iHashCode19 = (iHashCode18 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f51301t;
        int iHashCode20 = (iHashCode19 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f51302u;
        int iHashCode21 = (iHashCode20 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.f51303v;
        int iHashCode22 = (iHashCode21 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.f51304w;
        int iHashCode23 = (iHashCode22 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.f51305x;
        int iHashCode24 = (iHashCode23 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str11 = this.f51306y;
        int iHashCode25 = (iHashCode24 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f51307z;
        int iHashCode26 = (iHashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f51276A;
        int iHashCode27 = (iHashCode26 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List list = this.f51277B;
        int iHashCode28 = (iHashCode27 + (list == null ? 0 : list.hashCode())) * 31;
        Set set = this.f51278C;
        int iHashCode29 = (iHashCode28 + (set == null ? 0 : set.hashCode())) * 31;
        String str14 = this.f51279D;
        int iHashCode30 = (iHashCode29 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f51280E;
        int iHashCode31 = (iHashCode30 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f51281F;
        return iHashCode31 + (str16 != null ? str16.hashCode() : 0);
    }

    public dpd0(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str8, String str9, String str10, SleepTimer sleepTimer, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str11, String str12, String str13, List list, Set set, String str14, String str15, String str16) {
        this.f51282a = z;
        this.f51283b = str;
        this.f51284c = str2;
        this.f51285d = str3;
        this.f51286e = str4;
        this.f51287f = str5;
        this.f51288g = str6;
        this.f51289h = str7;
        this.f51290i = num;
        this.f51291j = bool;
        this.f51292k = bool2;
        this.f51293l = bool3;
        this.f51294m = bool4;
        this.f51295n = bool5;
        this.f51296o = str8;
        this.f51297p = str9;
        this.f51298q = str10;
        this.f51299r = sleepTimer;
        this.f51300s = bool6;
        this.f51301t = bool7;
        this.f51302u = bool8;
        this.f51303v = bool9;
        this.f51304w = bool10;
        this.f51305x = bool11;
        this.f51306y = str11;
        this.f51307z = str12;
        this.f51276A = str13;
        this.f51277B = list;
        this.f51278C = set;
        this.f51279D = str14;
        this.f51280E = str15;
        this.f51281F = str16;
    }
}
