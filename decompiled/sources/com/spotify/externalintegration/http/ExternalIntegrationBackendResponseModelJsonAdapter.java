package com.spotify.externalintegration.http;

import java.util.List;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalIntegrationBackendResponseModelJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/http/ExternalIntegrationBackendResponseModel;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ExternalIntegrationBackendResponseModelJsonAdapter extends hk60<ExternalIntegrationBackendResponseModel> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3980a = xl60.C2578b.m91389a("section_content");

    /* JADX INFO: renamed from: b */
    public final hk60 f3981b;

    public ExternalIntegrationBackendResponseModelJsonAdapter(p0i0 p0i0Var) {
        this.f3981b = p0i0Var.m68706f(mp91.m62457j(List.class, ExternalIntegrationSectionContentModel.class), gbu.f78413a, "sectionContent");
    }

    @Override // p204p.hk60
    public final ExternalIntegrationBackendResponseModel fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        List list = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f3980a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0 && (list = (List) this.f3981b.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("sectionContent", "section_content", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (list != null) {
            return new ExternalIntegrationBackendResponseModel(list);
        }
        throw f0b1.m40461o("sectionContent", "section_content", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ExternalIntegrationBackendResponseModel externalIntegrationBackendResponseModel) {
        ExternalIntegrationBackendResponseModel externalIntegrationBackendResponseModel2 = externalIntegrationBackendResponseModel;
        if (externalIntegrationBackendResponseModel2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("section_content");
        this.f3981b.toJson(rm60Var, externalIntegrationBackendResponseModel2.sectionContent);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(61, "GeneratedJsonAdapter(ExternalIntegrationBackendResponseModel)");
    }
}
