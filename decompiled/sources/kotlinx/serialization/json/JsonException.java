package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m24212d2 = {"Lkotlinx/serialization/json/JsonException;", "Lkotlinx/serialization/SerializationException;", "Lkotlinx/serialization/json/JsonDecodingException;", "Lkotlinx/serialization/json/JsonEncodingException;", "kotlinx-serialization-json"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class JsonException extends SerializationException {

    /* JADX INFO: renamed from: a */
    public final String f10921a;

    public JsonException(String str) {
        super(str);
        this.f10921a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f10921a;
    }
}
