package com.spotify.localfiles.settings.localfiles.impl;

import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import kotlin.Metadata;
import p204p.bga;
import p204p.d850;
import p204p.dd01;
import p204p.ed01;
import p204p.far0;
import p204p.fbk;
import p204p.fd01;
import p204p.fiz;
import p204p.ibk;
import p204p.kpo;
import p204p.lcw0;
import p204p.lg01;
import p204p.na6;
import p204p.vjz;
import p204p.x09;
import p204p.yuk;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/localfiles/settings/localfiles/impl/LocalFilesSettingsValueAccessor;", "Lp/lg01;", "", "Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "localFilesFeature", "<init>", "(Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;)V", "oldValue", "newValue", "Lp/d850;", "interactionLoggingResult", "Lp/fd01;", "setValue", "(Ljava/lang/Boolean;ZLp/d850;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "Lp/fiz;", "getValue", "()Lp/fiz;", "value", "src_main_java_com_spotify_localfiles_settings_localfiles_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFilesSettingsValueAccessor extends lg01 {
    private final LocalFilesFeature localFilesFeature;

    /* JADX INFO: renamed from: com.spotify.localfiles.settings.localfiles.impl.LocalFilesSettingsValueAccessor$setValue$1 */
    @kpo(m57054c = "com.spotify.localfiles.settings.localfiles.impl.LocalFilesSettingsValueAccessor", m57055f = "LocalFilesSettingsValueAccessor.kt", m57056l = {23}, m57057m = "setValue", m57058v = 2)
    @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class C08611 extends ibk {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C08611(fbk<? super C08611> fbkVar) {
            super(fbkVar);
        }

        @Override // p204p.ly8
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalFilesSettingsValueAccessor.this.setValue((Boolean) null, false, (d850) null, (fbk<? super fd01>) this);
        }
    }

    public LocalFilesSettingsValueAccessor(LocalFilesFeature localFilesFeature) {
        this.localFilesFeature = localFilesFeature;
    }

    @Override // p204p.lg01
    public fiz getValue() {
        return new vjz(new lcw0(this.localFilesFeature.isEnabled(), 21), new far0(3, 6, null), 2);
    }

    @Override // p204p.lg01
    public /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), d850Var, (fbk<? super fd01>) fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object setValue(Boolean bool, boolean z, d850 d850Var, fbk<? super fd01> fbkVar) {
        C08611 c08611;
        if (fbkVar instanceof C08611) {
            c08611 = (C08611) fbkVar;
            int i = c08611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c08611.label = i - Integer.MIN_VALUE;
            } else {
                c08611 = new C08611(fbkVar);
            }
        } else {
            c08611 = new C08611(fbkVar);
        }
        Object obj = c08611.result;
        int i2 = c08611.label;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                LocalFilesFeature localFilesFeature = this.localFilesFeature;
                c08611.L$0 = null;
                c08611.L$1 = null;
                c08611.Z$0 = z;
                c08611.label = 1;
                Object enabled = localFilesFeature.setEnabled(z, c08611);
                yuk yukVar = yuk.f276404a;
                if (enabled == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = c08611.Z$0;
                bga.m29073P(obj);
            }
            return new ed01(Boolean.valueOf(z));
        } catch (Exception e) {
            na6.m63959g("Failed to " + (z ? x09.f256832d : "disable") + " Local Files feature in settings", e);
            return new dd01(0, null);
        }
    }
}
