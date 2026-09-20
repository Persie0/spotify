package kotlinx.serialization.json;

import kotlin.Metadata;
import p204p.dq60;
import p204p.wl51;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lkotlinx/serialization/json/JsonEncodingException;", "Lkotlinx/serialization/json/JsonException;", "kotlinx-serialization-json"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class JsonEncodingException extends JsonException {
    /* JADX WARN: Illegal instructions before constructor call */
    public JsonEncodingException(String str, String str2) {
        StringBuilder sbM36620t = dq60.m36620t(str);
        sbM36620t.append((str2 == null || wl51.m88460J0(str2)) ? "" : "\n".concat(str2));
        super(sbM36620t.toString());
    }

    public /* synthetic */ JsonEncodingException(String str, String str2, int i) {
        this(str, (i & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }
}
