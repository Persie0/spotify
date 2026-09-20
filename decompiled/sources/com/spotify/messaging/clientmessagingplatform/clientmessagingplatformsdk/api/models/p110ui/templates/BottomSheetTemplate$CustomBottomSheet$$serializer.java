package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates;

import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import p204p.deu;
import p204p.frh;
import p204p.fro;
import p204p.g210;
import p204p.gtq;
import p204p.hrh;
import p204p.ktz0;
import p204p.rr60;
import p204p.vwp0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000@\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00050\u0004B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00030\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00040\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00050\b¢\u0006\u0004\b\u0006\u0010\fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00052\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0017¢\u0006\u0004\b\u001a\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m24212d2 = {"com/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate.CustomBottomSheet.$serializer", "P", "S", "E", "Lp/g210;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$CustomBottomSheet;", "<init>", "()V", "Lp/rr60;", "typeSerial0", "typeSerial1", "typeSerial2", "(Lp/rr60;Lp/rr60;Lp/rr60;)V", "Lp/deu;", "encoder", "value", "Lp/w2a1;", "serialize", "(Lp/deu;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$CustomBottomSheet;)V", "Lp/fro;", "decoder", "deserialize", "(Lp/fro;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$CustomBottomSheet;", "", "childSerializers", "()[Lp/rr60;", "typeParametersSerializers", "Lp/ktz0;", "descriptor", "Lp/ktz0;", "getDescriptor", "()Lp/ktz0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@gtq
public final /* synthetic */ class BottomSheetTemplate$CustomBottomSheet$$serializer<P, S, E> implements g210 {
    public static final int $stable = 8;
    private final ktz0 descriptor;
    private final /* synthetic */ rr60 typeSerial0;
    private final /* synthetic */ rr60 typeSerial1;
    private final /* synthetic */ rr60 typeSerial2;

    private BottomSheetTemplate$CustomBottomSheet$$serializer() {
        this.descriptor = new vwp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate.CustomBottomSheet", this, 0);
    }

    private final /* synthetic */ rr60 getTypeSerial0() {
        return this.typeSerial0;
    }

    private final /* synthetic */ rr60 getTypeSerial1() {
        return this.typeSerial1;
    }

    private final /* synthetic */ rr60 getTypeSerial2() {
        return this.typeSerial2;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[0];
    }

    @Override // p204p.rr60
    public final BottomSheetTemplate.CustomBottomSheet<P, S, E> deserialize(fro decoder) {
        ktz0 ktz0Var = this.descriptor;
        frh frhVarMo29814b = decoder.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
        if (iMo29816p != -1) {
            throw new UnknownFieldException(iMo29816p);
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new BottomSheetTemplate.CustomBottomSheet<>(0, null);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return this.descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu encoder, BottomSheetTemplate.CustomBottomSheet<P, S, E> value) {
        ktz0 ktz0Var = this.descriptor;
        hrh hrhVarMo35820b = encoder.mo35820b(ktz0Var);
        rr60 rr60Var = this.typeSerial0;
        rr60 rr60Var2 = this.typeSerial1;
        rr60 rr60Var3 = this.typeSerial2;
        BottomSheetTemplate.write$Self(value, hrhVarMo35820b, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }

    @Override // p204p.g210
    public final rr60[] typeParametersSerializers() {
        return new rr60[]{this.typeSerial0, this.typeSerial1, this.typeSerial2};
    }

    public BottomSheetTemplate$CustomBottomSheet$$serializer(rr60 rr60Var, rr60 rr60Var2, rr60 rr60Var3) {
        this();
        this.typeSerial0 = rr60Var;
        this.typeSerial1 = rr60Var2;
        this.typeSerial2 = rr60Var3;
    }
}
