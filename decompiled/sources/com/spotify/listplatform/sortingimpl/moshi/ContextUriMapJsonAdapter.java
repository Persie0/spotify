package com.spotify.listplatform.sortingimpl.moshi;

import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p204p.be00;
import p204p.hk60;
import p204p.jx71;
import p204p.nau;
import p204p.rm60;
import p204p.s9k;
import p204p.xl60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/listplatform/sortingimpl/moshi/ContextUriMapJsonAdapter;", "Lp/hk60;", "", "Lp/s9k;", "", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Ljava/util/Map;", "Lp/rm60;", "writer", "map", "Lp/w2a1;", "toJson", "(Lp/rm60;Ljava/util/Map;)V", "src_main_java_com_spotify_listplatform_sortingimpl-sortingimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ContextUriMapJsonAdapter extends hk60<Map<s9k, ? extends String>> {

    /* JADX INFO: renamed from: a */
    public final ContextUriJsonAdapter f5120a;

    public ContextUriMapJsonAdapter(ContextUriJsonAdapter contextUriJsonAdapter) {
        this.f5120a = contextUriJsonAdapter;
    }

    @Override // p204p.hk60
    public final /* bridge */ /* synthetic */ void toJson(rm60 rm60Var, Map<s9k, ? extends String> map) {
        toJson2(rm60Var, (Map<s9k, String>) map);
    }

    public final String toString() {
        return "JsonAdapter(" + this.f5120a + "=StringAdapter)";
    }

    @Override // p204p.hk60
    @be00
    public Map<s9k, ? extends String> fromJson(xl60 reader) {
        s9k s9kVarFromJson;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        reader.mo51076c();
        while (reader.mo51079i()) {
            reader.mo51070G();
            try {
                s9kVarFromJson = this.f5120a.fromJson(reader);
            } catch (JsonDataException | IOException unused) {
                s9kVarFromJson = null;
            }
            Object objM91381J = reader.m91381J();
            String str = objM91381J instanceof String ? (String) objM91381J : null;
            if (s9kVarFromJson != null && str != null) {
                linkedHashMap.put(s9kVarFromJson, str);
            }
        }
        reader.mo51078f();
        return linkedHashMap;
    }

    @jx71
    /* JADX INFO: renamed from: toJson, reason: avoid collision after fix types in other method */
    public void toJson2(rm60 writer, Map<s9k, String> map) {
        writer.mo56891e();
        if (map == null) {
            map = nau.f152117a;
        }
        for (Map.Entry<s9k, String> entry : map.entrySet()) {
            s9k key = entry.getKey();
            String value = entry.getValue();
            writer.m75915z();
            this.f5120a.toJson(writer, key);
            writer.mo56887N(value);
        }
        writer.mo56893i();
    }
}
