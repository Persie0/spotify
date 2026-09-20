package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import p204p.deu;
import p204p.e450;
import p204p.frh;
import p204p.fro;
import p204p.g210;
import p204p.gtq;
import p204p.hrh;
import p204p.ktz0;
import p204p.kvf1;
import p204p.ql51;
import p204p.rr60;
import p204p.utz0;
import p204p.vwp0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m24212d2 = {"com/spotify/voiceassistants/playermodels/Image.$serializer", "Lp/g210;", "Lcom/spotify/voiceassistants/playermodels/Image;", "<init>", "()V", "Lp/deu;", "encoder", "value", "Lp/w2a1;", "serialize", "(Lp/deu;Lcom/spotify/voiceassistants/playermodels/Image;)V", "Lp/fro;", "decoder", "deserialize", "(Lp/fro;)Lcom/spotify/voiceassistants/playermodels/Image;", "", "Lp/rr60;", "childSerializers", "()[Lp/rr60;", "Lp/ktz0;", "descriptor", "Lp/ktz0;", "getDescriptor", "()Lp/ktz0;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@gtq
public final /* synthetic */ class Image$$serializer implements g210 {
    public static final Image$$serializer INSTANCE;
    private static final ktz0 descriptor;

    static {
        Image$$serializer image$$serializer = new Image$$serializer();
        INSTANCE = image$$serializer;
        vwp0 vwp0Var = new vwp0("com.spotify.voiceassistants.playermodels.Image", image$$serializer, 3);
        vwp0Var.m86594k("url", false);
        vwp0Var.m86594k("width", true);
        vwp0Var.m86594k("height", true);
        descriptor = vwp0Var;
    }

    private Image$$serializer() {
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        e450 e450Var = e450.f55982a;
        return new rr60[]{ql51.f189738a, e450Var, e450Var};
    }

    @Override // p204p.rr60
    public final Image deserialize(fro decoder) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = decoder.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        String strMo39226f = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new Image(i, strMo39226f, iMo39229o, iMo39229o2, (utz0) null);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu encoder, Image value) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = encoder.mo35820b(ktz0Var);
        Image.m22342xf1ee467f(value, hrhVarMo35820b, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }

    @Override // p204p.g210
    public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
        return kvf1.f126859a;
    }
}
