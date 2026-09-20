package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ne01 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ne01 f152890a;
    private static final ktz0 descriptor;

    static {
        ne01 ne01Var = new ne01();
        f152890a = ne01Var;
        vwp0 vwp0Var = new vwp0("com.spotify.settings.rxsettings.SettingsState", ne01Var, 23);
        vwp0Var.m86594k("offline_mode", false);
        vwp0Var.m86594k("play_explicit_content", false);
        vwp0Var.m86594k("private_session", false);
        vwp0Var.m86594k("download_over_3g", false);
        vwp0Var.m86594k("download_quality", false);
        vwp0Var.m86594k("stream_quality", false);
        vwp0Var.m86594k("stream_non_metered_quality", false);
        vwp0Var.m86594k("allow_audio_quality_downgrade", false);
        vwp0Var.m86594k("gapless", false);
        vwp0Var.m86594k("automix", false);
        vwp0Var.m86594k("normalize", false);
        vwp0Var.m86594k("loudness_environment", false);
        vwp0Var.m86594k("crossfade", false);
        vwp0Var.m86594k("crossfade_time_seconds", false);
        vwp0Var.m86594k("show_unavailable_tracks", false);
        vwp0Var.m86594k("local_devices_only", false);
        vwp0Var.m86594k("webgate_url", false);
        vwp0Var.m86594k("download_preferred_resource_type", false);
        vwp0Var.m86594k("downmix", false);
        vwp0Var.m86594k("on_the_fly_normalizer", false);
        vwp0Var.m86594k("parrot", false);
        vwp0Var.m86594k("crossfeed", false);
        vwp0Var.m86594k("crossfeed_intensity", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        l8a l8aVar = l8a.f130828a;
        e450 e450Var = e450.f55982a;
        return new rr60[]{l8aVar, l8aVar, l8aVar, l8aVar, e450Var, e450Var, e450Var, l8aVar, l8aVar, l8aVar, l8aVar, e450Var, l8aVar, e450Var, l8aVar, l8aVar, ql51.f189738a, e450Var, l8aVar, l8aVar, l8aVar, l8aVar, e450Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        int i;
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i2 = 0;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        boolean zMo39217M3 = false;
        boolean zMo39217M4 = false;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        int iMo39229o3 = 0;
        boolean zMo39217M5 = false;
        boolean zMo39217M6 = false;
        boolean zMo39217M7 = false;
        boolean zMo39217M8 = false;
        int iMo39229o4 = 0;
        boolean zMo39217M9 = false;
        int iMo39229o5 = 0;
        boolean zMo39217M10 = false;
        boolean zMo39217M11 = false;
        int iMo39229o6 = 0;
        boolean zMo39217M12 = false;
        boolean zMo39217M13 = false;
        boolean zMo39217M14 = false;
        boolean zMo39217M15 = false;
        int iMo39229o7 = 0;
        String strMo39226f = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    zMo39217M3 = frhVarMo29814b.mo39217M(ktz0Var, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    zMo39217M4 = frhVarMo29814b.mo39217M(ktz0Var, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    iMo39229o3 = frhVarMo29814b.mo39229o(ktz0Var, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    zMo39217M5 = frhVarMo29814b.mo39217M(ktz0Var, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    zMo39217M6 = frhVarMo29814b.mo39217M(ktz0Var, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    zMo39217M7 = frhVarMo29814b.mo39217M(ktz0Var, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    zMo39217M8 = frhVarMo29814b.mo39217M(ktz0Var, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    iMo39229o4 = frhVarMo29814b.mo39229o(ktz0Var, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    zMo39217M9 = frhVarMo29814b.mo39217M(ktz0Var, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    iMo39229o5 = frhVarMo29814b.mo39229o(ktz0Var, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    zMo39217M10 = frhVarMo29814b.mo39217M(ktz0Var, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    zMo39217M11 = frhVarMo29814b.mo39217M(ktz0Var, 15);
                    i = 32768;
                    break;
                case 16:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 16);
                    i = 65536;
                    break;
                case 17:
                    iMo39229o6 = frhVarMo29814b.mo39229o(ktz0Var, 17);
                    i = 131072;
                    break;
                case 18:
                    zMo39217M12 = frhVarMo29814b.mo39217M(ktz0Var, 18);
                    i = 262144;
                    break;
                case 19:
                    zMo39217M13 = frhVarMo29814b.mo39217M(ktz0Var, 19);
                    i = 524288;
                    break;
                case 20:
                    zMo39217M14 = frhVarMo29814b.mo39217M(ktz0Var, 20);
                    i = 1048576;
                    break;
                case 21:
                    zMo39217M15 = frhVarMo29814b.mo39217M(ktz0Var, 21);
                    i = 2097152;
                    break;
                case 22:
                    iMo39229o7 = frhVarMo29814b.mo39229o(ktz0Var, 22);
                    i = 4194304;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
            i2 |= i;
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new pe01(i2, zMo39217M, zMo39217M2, zMo39217M3, zMo39217M4, iMo39229o, iMo39229o2, iMo39229o3, zMo39217M5, zMo39217M6, zMo39217M7, zMo39217M8, iMo39229o4, zMo39217M9, iMo39229o5, zMo39217M10, zMo39217M11, strMo39226f, iMo39229o6, zMo39217M12, zMo39217M13, zMo39217M14, zMo39217M15, iMo39229o7);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        pe01 pe01Var = (pe01) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 0, pe01Var.f176584a);
        hrhVarMo35820b.mo44930E(ktz0Var, 1, pe01Var.f176585b);
        hrhVarMo35820b.mo44930E(ktz0Var, 2, pe01Var.f176586c);
        hrhVarMo35820b.mo44930E(ktz0Var, 3, pe01Var.f176587d);
        hrhVarMo35820b.mo44938e(4, pe01Var.f176588e, ktz0Var);
        hrhVarMo35820b.mo44938e(5, pe01Var.f176589f, ktz0Var);
        hrhVarMo35820b.mo44938e(6, pe01Var.f176590g, ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 7, pe01Var.f176591h);
        hrhVarMo35820b.mo44930E(ktz0Var, 8, pe01Var.f176592i);
        hrhVarMo35820b.mo44930E(ktz0Var, 9, pe01Var.f176593j);
        hrhVarMo35820b.mo44930E(ktz0Var, 10, pe01Var.f176594k);
        hrhVarMo35820b.mo44938e(11, pe01Var.f176595l, ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 12, pe01Var.f176596m);
        hrhVarMo35820b.mo44938e(13, pe01Var.f176597n, ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 14, pe01Var.f176598o);
        hrhVarMo35820b.mo44930E(ktz0Var, 15, pe01Var.f176599p);
        hrhVarMo35820b.mo44931G(ktz0Var, 16, pe01Var.f176600q);
        hrhVarMo35820b.mo44938e(17, pe01Var.f176601r, ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 18, pe01Var.f176602s);
        hrhVarMo35820b.mo44930E(ktz0Var, 19, pe01Var.f176603t);
        hrhVarMo35820b.mo44930E(ktz0Var, 20, pe01Var.f176604u);
        hrhVarMo35820b.mo44930E(ktz0Var, 21, pe01Var.f176605v);
        hrhVarMo35820b.mo44938e(22, pe01Var.f176606w, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
