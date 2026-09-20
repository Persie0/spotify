package org.msgpack.core;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.ByteBufferInput;
import org.msgpack.core.buffer.ChannelBufferInput;
import org.msgpack.core.buffer.ChannelBufferOutput;
import org.msgpack.core.buffer.InputStreamBufferInput;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* JADX INFO: loaded from: classes16.dex */
public class MessagePack {
    public static final Charset UTF8 = Charset.forName("UTF-8");
    public static final PackerConfig DEFAULT_PACKER_CONFIG = new PackerConfig();
    public static final UnpackerConfig DEFAULT_UNPACKER_CONFIG = new UnpackerConfig();

    public static final class Code {
        public static final byte ARRAY16 = -36;
        public static final byte ARRAY32 = -35;
        public static final byte BIN16 = -59;
        public static final byte BIN32 = -58;
        public static final byte BIN8 = -60;
        public static final byte EXT16 = -56;
        public static final byte EXT32 = -55;
        public static final byte EXT8 = -57;
        public static final byte FALSE = -62;
        public static final byte FIXARRAY_PREFIX = -112;
        public static final byte FIXEXT1 = -44;
        public static final byte FIXEXT16 = -40;
        public static final byte FIXEXT2 = -43;
        public static final byte FIXEXT4 = -42;
        public static final byte FIXEXT8 = -41;
        public static final byte FIXMAP_PREFIX = -128;
        public static final byte FIXSTR_PREFIX = -96;
        public static final byte FLOAT32 = -54;
        public static final byte FLOAT64 = -53;
        public static final byte INT16 = -47;
        public static final byte INT32 = -46;
        public static final byte INT64 = -45;
        public static final byte INT8 = -48;
        public static final byte MAP16 = -34;
        public static final byte MAP32 = -33;
        public static final byte NEGFIXINT_PREFIX = -32;
        public static final byte NEVER_USED = -63;
        public static final byte NIL = -64;
        public static final byte POSFIXINT_MASK = -128;
        public static final byte STR16 = -38;
        public static final byte STR32 = -37;
        public static final byte STR8 = -39;
        public static final byte TRUE = -61;
        public static final byte UINT16 = -51;
        public static final byte UINT32 = -50;
        public static final byte UINT64 = -49;
        public static final byte UINT8 = -52;

        public static final boolean isFixInt(byte b) {
            int i = b & 255;
            return i <= 127 || i >= 224;
        }

        public static final boolean isFixStr(byte b) {
            return (b & NEGFIXINT_PREFIX) == -96;
        }

        public static final boolean isFixedArray(byte b) {
            return (b & (-16)) == -112;
        }

        public static final boolean isFixedMap(byte b) {
            return (b & (-16)) == -128;
        }

        public static final boolean isFixedRaw(byte b) {
            return (b & NEGFIXINT_PREFIX) == -96;
        }

        public static final boolean isNegFixInt(byte b) {
            return (b & NEGFIXINT_PREFIX) == -32;
        }

        public static final boolean isPosFixInt(byte b) {
            return (b & (-128)) == 0;
        }
    }

    public static class PackerConfig implements Cloneable {
        private int bufferFlushThreshold;
        private int bufferSize;
        private int smallStringOptimizationThreshold;
        private boolean str8FormatSupport;

        public PackerConfig() {
            this.smallStringOptimizationThreshold = 512;
            this.bufferFlushThreshold = 8192;
            this.bufferSize = 8192;
            this.str8FormatSupport = true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PackerConfig)) {
                return false;
            }
            PackerConfig packerConfig = (PackerConfig) obj;
            return this.smallStringOptimizationThreshold == packerConfig.smallStringOptimizationThreshold && this.bufferFlushThreshold == packerConfig.bufferFlushThreshold && this.bufferSize == packerConfig.bufferSize && this.str8FormatSupport == packerConfig.str8FormatSupport;
        }

        public int getBufferFlushThreshold() {
            return this.bufferFlushThreshold;
        }

        public int getBufferSize() {
            return this.bufferSize;
        }

        public int getSmallStringOptimizationThreshold() {
            return this.smallStringOptimizationThreshold;
        }

        public int hashCode() {
            return (((((this.smallStringOptimizationThreshold * 31) + this.bufferFlushThreshold) * 31) + this.bufferSize) * 31) + (this.str8FormatSupport ? 1 : 0);
        }

        public boolean isStr8FormatSupport() {
            return this.str8FormatSupport;
        }

        public MessageBufferPacker newBufferPacker() {
            return new MessageBufferPacker(this);
        }

        public MessagePacker newPacker(MessageBufferOutput messageBufferOutput) {
            return new MessagePacker(messageBufferOutput, this);
        }

        public PackerConfig withBufferFlushThreshold(int i) {
            PackerConfig packerConfigClone = clone();
            packerConfigClone.bufferFlushThreshold = i;
            return packerConfigClone;
        }

        public PackerConfig withBufferSize(int i) {
            PackerConfig packerConfigClone = clone();
            packerConfigClone.bufferSize = i;
            return packerConfigClone;
        }

        public PackerConfig withSmallStringOptimizationThreshold(int i) {
            PackerConfig packerConfigClone = clone();
            packerConfigClone.smallStringOptimizationThreshold = i;
            return packerConfigClone;
        }

        public PackerConfig withStr8FormatSupport(boolean z) {
            PackerConfig packerConfigClone = clone();
            packerConfigClone.str8FormatSupport = z;
            return packerConfigClone;
        }

        public PackerConfig clone() {
            return new PackerConfig(this);
        }

        public MessagePacker newPacker(OutputStream outputStream) {
            return newPacker(new OutputStreamBufferOutput(outputStream, this.bufferSize));
        }

        public MessagePacker newPacker(WritableByteChannel writableByteChannel) {
            return newPacker(new ChannelBufferOutput(writableByteChannel, this.bufferSize));
        }

        private PackerConfig(PackerConfig packerConfig) {
            this.smallStringOptimizationThreshold = 512;
            this.bufferFlushThreshold = 8192;
            this.bufferSize = 8192;
            this.str8FormatSupport = true;
            this.smallStringOptimizationThreshold = packerConfig.smallStringOptimizationThreshold;
            this.bufferFlushThreshold = packerConfig.bufferFlushThreshold;
            this.bufferSize = packerConfig.bufferSize;
            this.str8FormatSupport = packerConfig.str8FormatSupport;
        }
    }

    public static class UnpackerConfig implements Cloneable {
        private CodingErrorAction actionOnMalformedString;
        private CodingErrorAction actionOnUnmappableString;
        private boolean allowReadingBinaryAsString;
        private boolean allowReadingStringAsBinary;
        private int bufferSize;
        private int stringDecoderBufferSize;
        private int stringSizeLimit;

        public UnpackerConfig() {
            this.allowReadingStringAsBinary = true;
            this.allowReadingBinaryAsString = true;
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.actionOnMalformedString = codingErrorAction;
            this.actionOnUnmappableString = codingErrorAction;
            this.stringSizeLimit = Alert.DURATION_SHOW_INDEFINITELY;
            this.bufferSize = 8192;
            this.stringDecoderBufferSize = 8192;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof UnpackerConfig)) {
                return false;
            }
            UnpackerConfig unpackerConfig = (UnpackerConfig) obj;
            return this.allowReadingStringAsBinary == unpackerConfig.allowReadingStringAsBinary && this.allowReadingBinaryAsString == unpackerConfig.allowReadingBinaryAsString && this.actionOnMalformedString == unpackerConfig.actionOnMalformedString && this.actionOnUnmappableString == unpackerConfig.actionOnUnmappableString && this.stringSizeLimit == unpackerConfig.stringSizeLimit && this.stringDecoderBufferSize == unpackerConfig.stringDecoderBufferSize && this.bufferSize == unpackerConfig.bufferSize;
        }

        public CodingErrorAction getActionOnMalformedString() {
            return this.actionOnMalformedString;
        }

        public CodingErrorAction getActionOnUnmappableString() {
            return this.actionOnUnmappableString;
        }

        public boolean getAllowReadingBinaryAsString() {
            return this.allowReadingBinaryAsString;
        }

        public boolean getAllowReadingStringAsBinary() {
            return this.allowReadingStringAsBinary;
        }

        public int getBufferSize() {
            return this.bufferSize;
        }

        public int getStringDecoderBufferSize() {
            return this.stringDecoderBufferSize;
        }

        public int getStringSizeLimit() {
            return this.stringSizeLimit;
        }

        public int hashCode() {
            int i = (((this.allowReadingStringAsBinary ? 1 : 0) * 31) + (this.allowReadingBinaryAsString ? 1 : 0)) * 31;
            CodingErrorAction codingErrorAction = this.actionOnMalformedString;
            int iHashCode = (i + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
            CodingErrorAction codingErrorAction2 = this.actionOnUnmappableString;
            return ((((((iHashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.stringSizeLimit) * 31) + this.bufferSize) * 31) + this.stringDecoderBufferSize;
        }

        public MessageUnpacker newUnpacker(MessageBufferInput messageBufferInput) {
            return new MessageUnpacker(messageBufferInput, this);
        }

        public UnpackerConfig withActionOnMalformedString(CodingErrorAction codingErrorAction) {
            UnpackerConfig unpackerConfigClone = clone();
            unpackerConfigClone.actionOnMalformedString = codingErrorAction;
            return unpackerConfigClone;
        }

        public UnpackerConfig withActionOnUnmappableString(CodingErrorAction codingErrorAction) {
            UnpackerConfig unpackerConfigClone = clone();
            unpackerConfigClone.actionOnUnmappableString = codingErrorAction;
            return unpackerConfigClone;
        }

        public UnpackerConfig withAllowReadingBinaryAsString(boolean z) {
            UnpackerConfig unpackerConfigClone = clone();
            unpackerConfigClone.allowReadingBinaryAsString = z;
            return unpackerConfigClone;
        }

        public UnpackerConfig withAllowReadingStringAsBinary(boolean z) {
            UnpackerConfig unpackerConfigClone = clone();
            unpackerConfigClone.allowReadingStringAsBinary = z;
            return unpackerConfigClone;
        }

        public UnpackerConfig withBufferSize(int i) {
            UnpackerConfig unpackerConfigClone = clone();
            unpackerConfigClone.bufferSize = i;
            return unpackerConfigClone;
        }

        public UnpackerConfig withStringDecoderBufferSize(int i) {
            UnpackerConfig unpackerConfigClone = clone();
            unpackerConfigClone.stringDecoderBufferSize = i;
            return unpackerConfigClone;
        }

        public UnpackerConfig withStringSizeLimit(int i) {
            UnpackerConfig unpackerConfigClone = clone();
            unpackerConfigClone.stringSizeLimit = i;
            return unpackerConfigClone;
        }

        public UnpackerConfig clone() {
            return new UnpackerConfig(this);
        }

        public MessageUnpacker newUnpacker(InputStream inputStream) {
            return newUnpacker(new InputStreamBufferInput(inputStream, this.bufferSize));
        }

        public MessageUnpacker newUnpacker(ReadableByteChannel readableByteChannel) {
            return newUnpacker(new ChannelBufferInput(readableByteChannel, this.bufferSize));
        }

        public MessageUnpacker newUnpacker(byte[] bArr) {
            return newUnpacker(new ArrayBufferInput(bArr));
        }

        public MessageUnpacker newUnpacker(byte[] bArr, int i, int i2) {
            return newUnpacker(new ArrayBufferInput(bArr, i, i2));
        }

        public MessageUnpacker newUnpacker(ByteBuffer byteBuffer) {
            return newUnpacker(new ByteBufferInput(byteBuffer));
        }

        private UnpackerConfig(UnpackerConfig unpackerConfig) {
            this.allowReadingStringAsBinary = true;
            this.allowReadingBinaryAsString = true;
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.actionOnMalformedString = codingErrorAction;
            this.actionOnUnmappableString = codingErrorAction;
            this.stringSizeLimit = Alert.DURATION_SHOW_INDEFINITELY;
            this.bufferSize = 8192;
            this.stringDecoderBufferSize = 8192;
            this.allowReadingStringAsBinary = unpackerConfig.allowReadingStringAsBinary;
            this.allowReadingBinaryAsString = unpackerConfig.allowReadingBinaryAsString;
            this.actionOnMalformedString = unpackerConfig.actionOnMalformedString;
            this.actionOnUnmappableString = unpackerConfig.actionOnUnmappableString;
            this.stringSizeLimit = unpackerConfig.stringSizeLimit;
            this.bufferSize = unpackerConfig.bufferSize;
        }
    }

    private MessagePack() {
    }

    public static MessageBufferPacker newDefaultBufferPacker() {
        return DEFAULT_PACKER_CONFIG.newBufferPacker();
    }

    public static MessagePacker newDefaultPacker(MessageBufferOutput messageBufferOutput) {
        return DEFAULT_PACKER_CONFIG.newPacker(messageBufferOutput);
    }

    public static MessageUnpacker newDefaultUnpacker(MessageBufferInput messageBufferInput) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(messageBufferInput);
    }

    public static MessagePacker newDefaultPacker(OutputStream outputStream) {
        return DEFAULT_PACKER_CONFIG.newPacker(outputStream);
    }

    public static MessageUnpacker newDefaultUnpacker(InputStream inputStream) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(inputStream);
    }

    public static MessagePacker newDefaultPacker(WritableByteChannel writableByteChannel) {
        return DEFAULT_PACKER_CONFIG.newPacker(writableByteChannel);
    }

    public static MessageUnpacker newDefaultUnpacker(ReadableByteChannel readableByteChannel) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(readableByteChannel);
    }

    public static MessageUnpacker newDefaultUnpacker(byte[] bArr) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(bArr);
    }

    public static MessageUnpacker newDefaultUnpacker(byte[] bArr, int i, int i2) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(bArr, i, i2);
    }

    public static MessageUnpacker newDefaultUnpacker(ByteBuffer byteBuffer) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(byteBuffer);
    }
}
