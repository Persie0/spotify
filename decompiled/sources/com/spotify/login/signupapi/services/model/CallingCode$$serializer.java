package com.spotify.login.signupapi.services.model;

import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import p204p.deu;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m24212d2 = {"com/spotify/login/signupapi/services/model/CallingCode.$serializer", "Lp/g210;", "Lcom/spotify/login/signupapi/services/model/CallingCode;", "<init>", "()V", "Lp/deu;", "encoder", "value", "Lp/w2a1;", "serialize", "(Lp/deu;Lcom/spotify/login/signupapi/services/model/CallingCode;)V", "Lp/fro;", "decoder", "deserialize", "(Lp/fro;)Lcom/spotify/login/signupapi/services/model/CallingCode;", "", "Lp/rr60;", "childSerializers", "()[Lp/rr60;", "Lp/ktz0;", "descriptor", "Lp/ktz0;", "getDescriptor", "()Lp/ktz0;", "src_main_java_com_spotify_login_signupapi-signupapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@gtq
public final /* synthetic */ class CallingCode$$serializer implements g210 {
    public static final CallingCode$$serializer INSTANCE;
    private static final ktz0 descriptor;

    static {
        CallingCode$$serializer callingCode$$serializer = new CallingCode$$serializer();
        INSTANCE = callingCode$$serializer;
        vwp0 vwp0Var = new vwp0("com.spotify.login.signupapi.services.model.CallingCode", callingCode$$serializer, 2);
        vwp0Var.m86594k("country_code", false);
        vwp0Var.m86594k("calling_code", false);
        descriptor = vwp0Var;
    }

    private CallingCode$$serializer() {
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final CallingCode deserialize(fro decoder) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = decoder.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        utz0 utz0Var = null;
        boolean z = true;
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new CallingCode(i, strMo39226f, strMo39226f2, utz0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu encoder, CallingCode value) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = encoder.mo35820b(ktz0Var);
        CallingCode.write$Self$src_main_java_com_spotify_login_signupapi_signupapi(value, hrhVarMo35820b, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }

    @Override // p204p.g210
    public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
        return kvf1.f126859a;
    }
}
