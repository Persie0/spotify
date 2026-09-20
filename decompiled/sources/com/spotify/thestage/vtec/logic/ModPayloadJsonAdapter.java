package com.spotify.thestage.vtec.logic;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/ModPayloadJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/ModPayload;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ModPayloadJsonAdapter extends hk60<ModPayload> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6741a = xl60.C2578b.m91389a("modType", "data");

    /* JADX INFO: renamed from: b */
    public final hk60 f6742b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6743c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f6744d;

    public ModPayloadJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6742b = p0i0Var.m68706f(String.class, gbuVar, "modType");
        this.f6743c = p0i0Var.m68706f(String.class, gbuVar, "data");
    }

    @Override // p204p.hk60
    public final ModPayload fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6741a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f6742b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("modType", "modType", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str2 = (String) this.f6743c.fromJson(xl60Var);
                i = -3;
            }
        }
        xl60Var.mo51078f();
        if (i == -3) {
            if (str != null) {
                return new ModPayload(str, str2);
            }
            throw f0b1.m40461o("modType", "modType", xl60Var);
        }
        Constructor declaredConstructor = this.f6744d;
        if (declaredConstructor == null) {
            declaredConstructor = ModPayload.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f6744d = declaredConstructor;
        }
        if (str != null) {
            return (ModPayload) declaredConstructor.newInstance(str, str2, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("modType", "modType", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ModPayload modPayload) {
        ModPayload modPayload2 = modPayload;
        if (modPayload2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("modType");
        this.f6742b.toJson(rm60Var, modPayload2.f6739a);
        rm60Var.mo56894s("data");
        this.f6743c.toJson(rm60Var, modPayload2.f6740b);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(32, "GeneratedJsonAdapter(ModPayload)");
    }
}
